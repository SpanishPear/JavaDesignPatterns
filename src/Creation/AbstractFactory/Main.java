package Creation.AbstractFactory;

import Creation.AbstractFactory.app.Application;
import Creation.AbstractFactory.factories.GUIFactory;
import Creation.AbstractFactory.factories.MacOSFactory;
import Creation.AbstractFactory.factories.WindowsFactory;

public class Main {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     *
     * Abstract factory -- factory that produces factory lol
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

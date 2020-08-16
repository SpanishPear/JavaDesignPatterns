package Creation.AbstractFactory.app;

import Creation.AbstractFactory.Buttons.Button;
import Creation.AbstractFactory.Checkboxes.Checkbox;
import Creation.AbstractFactory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 * This is important!!
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
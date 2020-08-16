package Creation.Singleton;


// note this is non-thread safe, but who cares! :)
public final class Singleton {
    // A static variable is common to all the instances (or objects) of the class because it is a class level variable.
    // In other words you can say that only a single copy of static variable is created and shared among all the instances of the class.
    // https://beginnersbook.com/2013/04/java-static-class-block-methods-variables/

    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
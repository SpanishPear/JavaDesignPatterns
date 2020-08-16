package Creation.AbstractFactory.factories;


import Creation.AbstractFactory.Buttons.Button;
import Creation.AbstractFactory.Buttons.MacOSButton;
import Creation.AbstractFactory.Checkboxes.Checkbox;
import Creation.AbstractFactory.Checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
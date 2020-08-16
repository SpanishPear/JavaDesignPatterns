package Creation.AbstractFactory.factories;

import Creation.AbstractFactory.Buttons.Button;
import Creation.AbstractFactory.Buttons.WindowsButton;
import Creation.AbstractFactory.Checkboxes.Checkbox;
import Creation.AbstractFactory.Checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

package Creation.AbstractFactory.factories;

import Creation.AbstractFactory.Buttons.Button;
import Creation.AbstractFactory.Checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
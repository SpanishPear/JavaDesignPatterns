package Behavioural.State;

import Behavioural.State.ui.Player;
import Behavioural.State.ui.UI;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}


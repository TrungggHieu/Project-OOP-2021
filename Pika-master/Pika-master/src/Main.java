import control.GameController;

import static utils.Utils.WINDOW_HEIGHT;
import static utils.Utils.WINDOW_WIDTH;

public class Main{
    public static void main(String[] args) {
        GameController pikachu = new GameController("Pikachu");
        pikachu.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        pikachu.setLocationRelativeTo(null);
        pikachu.start();
    }
}
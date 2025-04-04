package Ejercicio_8;

import Ejercicio_8.Controller.Game;

public class Main {
    public static void main(String[] args) {

        //Config
        int rows = 8;
        int columns = 8;
        int numMines = 15;

        //Game init
        Game game = new Game(rows, columns, numMines);

        //Game Start
        game.startGame();
    }
}

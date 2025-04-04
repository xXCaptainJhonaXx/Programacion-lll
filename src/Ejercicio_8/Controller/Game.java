package Ejercicio_8.Controller;

import Ejercicio_8.Model.Cell;
import Ejercicio_8.Model.Coords;
import Ejercicio_8.Model.Table;
import Ejercicio_8.View.View;

public class Game {

    private Table table;
    private View view;
    private boolean inGame;

    public Game(int rows, int columns, int numMines) {
        this.table = new Table(rows, columns, numMines);
        this.view = new View();
        this.inGame = true;
    }

    public void startGame() {
        System.out.println("Bienvenido al buscaminas!");
        while (inGame) {
            view.ShowTable(table);
            Coords coords = view.getUserInput();
            processInput(coords);
        }
    }

    private void processInput(Coords coords) {
        int x = coords.getX();
        int y = coords.getY();

        if (!table.isValidCoord(x, y)) {
            System.out.println("Coordenas Invalidas");
            return;
        }


        if (table.getTable()[x][y].isRevealed()) {
            System.out.println("ya fue revelado, prueba otra");
            return;
        }

        //table.revealCell(x, y);

        if (table.getTable()[x][y].isMine()) {
            System.out.println("BOOM!!!");
            table.revealAll();
            view.ShowTable(table);
            inGame = false;
            return;

        }

        if (verifyVictory()) {
            System.out.println("Has Ganado");
            inGame = false;
        }
    }
    private boolean verifyVictory() {
        for (int i = 0; i < table.getTable().length; i++) {
            for (int j = 0; j < table.getTable()[i].length; i++) {
                Cell cell = table.getTable()[i][j];
                if (!cell.isMine() && !cell.isRevealed()) {
                    return false;
                }
            }
        }
        return true;
    }
}

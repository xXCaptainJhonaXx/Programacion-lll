package Ejercicio_8.Model;

import java.util.Random;

public class Table {

    private Cell[][] table;
    private int rows;
    private int columns;
    private int numMines;

    //init table

    public Table(int rows, int columns, int numMines) {
        this.rows = rows;
        this.columns = columns;
        this.numMines = numMines;
        table = new Cell[rows][columns];
        initTable();
        placeMines();
        calcNearbyMines();
    }

    private void initTable() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j] = new Cell();
            }
        }
    }

    private void placeMines() {
        Random random = new Random();
        int placedMines = 0;

        while (placedMines < numMines) {
            int x = random.nextInt(rows);
            int y = random.nextInt(columns);

            if (!table[x][y].isMine()) {
                table[x][y].setMine(true);
                placedMines++;
            }
        }

    }

    private void calcNearbyMines() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (!table[i][j].isMine()) {
                    table[i][j].setNearbyMines(countNearbyMines(i, j));
                }
            }
        }
    }

    private int countNearbyMines(int x, int y) {
        int counter = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                int newX = x + i;
                int newY = y + j;

                if (isValidCoord(newX, newY) && table[x][y].isMine()) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public boolean isValidCoord(int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < columns;
    }

    public void revealCell(int x, int y) {
        if (isValidCoord(x, y) && !table[x][y].isRevealed()) {
            table[x][y].Reveal();

            if (table[x][y].getNearbyMines() == 0 && !table[x][y].isMine()) {
                revealNearbyCells(x, y);
            }
        }

    }

    //REVELAR TODO AL PERDER
    public void revealAll() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j].Reveal();
            }
        }
    }

    private void revealNearbyCells(int x, int y) {
        for (int i = -1; i <= 1; i++) {
            for (int j = 0; j <= 1; i++) {
                int newX = x + i;
                int newY = y + j;

                if (isValidCoord(newX, newY) && table[newX][newY].isRevealed()) {
                    revealCell(newX, newY);
                }
            }
        }

    }

    public Cell[][] getTable() {
        return table;
    }



}

package Ejercicio_8.View;

import Ejercicio_8.Model.Cell;
import Ejercicio_8.Model.Coords;
import Ejercicio_8.Model.Table;

import java.util.Scanner;

public class View {

    private Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }

    public void ShowTable(Table table) {

        Cell[][] cells = table.getTable();
        System.out.println("Estado del tablero:");

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell cell = cells[i][j];
                if (cell.isRevealed()) {
                    if(cell.isMine()) {
                        System.out.print("* ");

                    } else {
                        System.out.print(cell.getNearbyMines() + " ");
                    }
                } else if (cell.isMarked()) {
                    System.out.println("B ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    public Coords getUserInput() {
        System.out.println("Introduce las coordenas (x, y) separadas por un espacio:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        return new Coords(x, y);
    }

    public void showMenssage(String menssage) {
        System.out.println(menssage);
    }


}
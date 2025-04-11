package Ejercicio_10;

public class Ejercicio_10 {

    int[][] matriz;

    public Ejercicio_10() {
        matriz = new int[5][5];
    }

    public void ejecutar() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int random = (int) (Math.random() * 9 + 1);

                matriz[i][j] = random;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSumamos por filas: ");
        for (int i = 0; i < matriz.length; i++) {
            int sum = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];

            }
            System.out.println("Suma fila " + i + ": " + sum);
        }

        System.out.println("\nSumamos por columnas");
        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
                
            }
            System.out.println("Suma fila " + j + ": " + suma);
        }
    }
}

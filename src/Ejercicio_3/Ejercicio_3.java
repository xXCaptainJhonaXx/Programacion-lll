package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

    int[] notas;
    Scanner sc;

    public Ejercicio_3() {
        notas = new int[5];
        sc = new Scanner(System.in);

    }

    public void ejecutar() {

        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" + i + "]: ");
            int nota = sc.nextInt();

            notas[i] = nota;

        }

        //mostrar notas

        double sum = 0;
        double prom;

        int max = 0;
        int min = 10;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" + i + "]: " + notas[i]);

            sum += notas[i];

            if (notas[i] < min) {
                min = notas[i];
            }

            if (notas[i] > max) {
                max = notas[i];
            }



        }
        prom = sum / notas.length;

        System.out.println("Promedio: " + prom);
        System.out.println("Maximo: " + max);
        System.out.println("Min: " + min);
    }
}

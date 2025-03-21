package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    String[] original;
    String[] inverso;

    Scanner sc;

    public Ejercicio_2() {
        original = new String[5];
        inverso = new String[5];

        sc = new Scanner(System.in);

    }

    public void ejecutar() {

        for (int i = 0; i < original.length; i++) {
            System.out.print("Original [" + i + "]: ");
            String cadena = sc.nextLine();

            original[i] = cadena;
        }

        //Invertir

        int IndiceOriginal = 0;
        int IndiceInverso = 4;

        while (IndiceOriginal < original.length) {
            inverso[IndiceInverso] = original[IndiceOriginal];
            IndiceOriginal++;
            IndiceInverso--;
        }

        for (int i = 0; i < inverso.length; i++) {
            System.out.println("Inverso[" + i + "]: " + inverso[i]);

        }

    }


}

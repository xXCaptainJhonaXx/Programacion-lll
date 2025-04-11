package Ejercicio_9;

import java.util.Scanner;

public class Ejercicio_9 {

    Dia[] dias;
    Scanner sc;

    public Ejercicio_9() {
        dias = new Dia[5];
        sc = new Scanner(System.in);

    }

    public void ejecutar() {
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Temperatura minima dias[" + i + "]: ");
            double minima = sc.nextDouble();

            System.out.println("Temperatura maxima dias[" + i + "]: ");
            double maxima = sc.nextDouble();

            double media = (minima + maxima) / 2.0;

            Dia dia = new Dia(maxima, minima, media);
            dias[i] = dia;

        }

        System.out.println("\nTemperatura media: ");
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Temperatura media dias[" + i + "]: " + dias[i].getTempMedia());
        }

        for (int i = 0; i < dias.length - 1; i++) {
            for (int j = 0; j < dias.length - 1 - i; j++) {
                if (dias[j].getTempMinima() > dias[j + 1].getTempMinima()) {
                    Dia aux = dias[j];
                    dias[j] = dias[j + 1];
                    dias[j + 1] = aux;
                }
            }
        }

        System.out.println("\nTemperaturas minimas");
        for (int i = 0; i < 2; i++) {
            System.out.println("Temperatura media dias[" + i + "]: " + dias[i].getTempMinima());
        }

        System.out.println("Ingrese una temperatura: ");
        double temp = sc.nextDouble();
        int count = 0;
        for (int i = 0; i < dias.length; i++) {
            if (temp == dias[i].getTempMaxima()) {
                System.out.println(dias[i]);
                count++;
            }

        }

        if (count == 0) {
            System.out.println("No existe");
        }
    }
}

package Ejercicio_5;

public class Ejercicio_5 {

    int[] vector;

    public Ejercicio_5() {
        vector = new int[10];
    }

    public void ejecutar() {

        for (int i = 0; i < vector.length; i++) {

            int random = (int) (Math.random() * 100 + 1);
            vector[i] = random;

        }

        //antes de ordenar
        System.out.println("Vector antes de ordenar: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i +"]: " + vector[i]);
        }
        //bubblesort
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        //despues de ordenar
        System.out.println("Vector despues de ordenar");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "]: " + vector[i]);
        }
    }

}

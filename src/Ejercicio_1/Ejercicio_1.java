package Ejercicio_1;

public class Ejercicio_1 {

    int[] vectorNum = new int[10];

    //constructor
    public Ejercicio_1() {

    }

    //metodo ejecutar
    public void ejecutar() {

        //iniciar vector con valores aleatorios
        for (int i = 0; i < vectorNum.length; i++) {
            int random = (int) (Math.random() * 10 + 1);

            vectorNum[i] = random;
        }

        for (int i = 0; i < vectorNum.length; i++) {
            int numero = vectorNum[i];
            int cuadrado = (int) Math.pow(numero, 2);
            int cubo = (int) Math.pow(numero, 3);
            System.out.println("Vector_Num [" + i + "]: " + numero + ", " + cuadrado +", " + cubo);
        }
    }


}

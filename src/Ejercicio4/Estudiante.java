package Ejercicio4;

import java.text.ParseException;
import java.util.Date;

public class Estudiante extends Persona {

    String codigoSIS;

    public Estudiante(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Integer numeroCI, String complemento, String codgoSIS) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento, numeroCI, complemento);
        this.codigoSIS = codgoSIS;
    }

    public void mostrarCodigoSIS() {
        System.out.println("Codigo SIS: " + codigoSIS);
    }
}

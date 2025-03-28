package Ejercicio4;

/* Implementar un programa que permita registrar a todos los estudiantes de la clase en
*  un arreglo de tamaño 18. Luego Ordenar el arreglo por edad y mostrarlo rn pantalla*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Persona {

    String nombre;
    String primerApellido;
    String segundoApellido;
    Date fechaNacimiento;
    Integer numeroCI;
    String complemento;

    //Constructor
    public Persona(String nombre,
                   String primerApellido,
                   String segundoApellido,
                   Date fechaNacimiento,
                   Integer numeroCI,
                   String complemento) {

        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCI = numeroCI;
        this.complemento = complemento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNumeroCI() {
        return numeroCI;
    }

    public void setNumeroCI(Integer numeroCI) {
        this.numeroCI = numeroCI;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Boolean ComplementoCI() {
        if (complemento == null) {
            return Boolean.FALSE;

        } else {
            return Boolean.TRUE;
        }
    }

    public Integer calcularEdad() {
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(fechaNacimiento);
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

        if (hoy.get(Calendar.DAY_OF_YEAR) < nacimiento.get(Calendar.DAY_OF_YEAR))
            edad--;
        return edad;
    }
}

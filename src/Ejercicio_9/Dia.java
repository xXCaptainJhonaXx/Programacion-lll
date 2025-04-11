package Ejercicio_9;

public class Dia {

    private double tempMaxima;
    private double tempMedia;
    private double tempMinima;

    public Dia(double tempMaxima, double tempMedia, double tempMinima) {
        this.setTempMaxima(tempMaxima);
        this.setTempMedia(tempMedia);
        this.setTempMinima(tempMinima);
    }

    @Override
    public String toString() {
        return "Dia{" +
                "tempMaxima=" + tempMaxima +
                ", tempMedia=" + tempMedia +
                ", tempMinima=" + tempMinima +
                '}';
    }

    public double getTempMaxima() {
        return tempMaxima;
    }

    public void setTempMaxima(double tempMaxima) {
        this.tempMaxima = tempMaxima;
    }

    public double getTempMedia() {
        return tempMedia;
    }

    public void setTempMedia(double tempMedia) {
        this.tempMedia = tempMedia;
    }

    public double getTempMinima() {
        return tempMinima;
    }

    public void setTempMinima(double tempMinima) {
        this.tempMinima = tempMinima;
    }
}

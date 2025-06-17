package Practica1;

public class Vehiculo {
    private String placa;
    private double kilometraje = 0.0;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
}

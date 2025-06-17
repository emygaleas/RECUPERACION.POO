package Practica2;
// casa, oficina, departamento
public abstract class Inmobiliaria {
    public String direccion;
    public String nomenclatura;
    public double costo;

    public Inmobiliaria(String direccion, String numero, double costo) {
        this.direccion = direccion;
        this.nomenclatura = numero;
        this.costo = costo;
    }

    public abstract void mostrarInformacion();
}

package Practica2;

public class Casa extends Inmobiliaria{
    public int numeroPisos;

    public Casa(String direccion, String nomenclatura, double costo, int numeroPisos) {
        super(direccion, nomenclatura, costo);
        this.numeroPisos = numeroPisos;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Dirección de la casa: " + direccion);
        System.out.println("Nomenclatura de casa: " + nomenclatura);
        System.out.println("Número de pisos: " + numeroPisos);
        System.out.println("Costo del departamento: " + costo);
    }
}

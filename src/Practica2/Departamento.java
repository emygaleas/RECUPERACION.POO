package Practica2;

public class Departamento extends Inmobiliaria{
    public String piso;

    public Departamento(String direccion, String nomenclatura, double costo, String piso) {
        super(direccion, nomenclatura, costo);
        this.piso = piso;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Dirección del departamento: " + direccion);
        System.out.println("Piso en el que se encuentra el departamento: " + piso);
        System.out.println("Nomenclatura: " + nomenclatura);
        System.out.println("Costo del departamento: " + costo);
    }

}

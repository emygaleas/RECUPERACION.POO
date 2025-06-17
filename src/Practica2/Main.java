package Practica2;

public class Main {
    public static void main(String[] args) {
        Inmobiliaria Departamento = new Departamento("Av. Mariscal Sucre","EO-0123",50000,"PB");
        Inmobiliaria Casa = new Casa("Av. Amazonas","OE3-7098",125000,3);

        System.out.println("Información inmuebles disponibles: ");
        System.out.println("\n----- DEPARTAMENTO -----");
        Departamento.mostrarInformacion();
        System.out.println("\n----- CASA -----");
        Casa.mostrarInformacion();
    }
}
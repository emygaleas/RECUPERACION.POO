package Practica3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona estudiante1 = new Estudiante("Emily","Desarrollo De Software","Tercer Semestre");
        Persona docente1 = new Docente("María",12);

        System.out.println("\n---------- INFORMACIÓN ----------");
        System.out.println("ESTUDIANTE");
        estudiante1.mostrarInformacion();
        System.out.printf("DOCENTE");
        docente1.mostrarInformacion();

        System.out.println("\n---------- ACTUALIZACIÓN DE DATOS ----------");
        System.out.println("ESTUDIANTE");
        System.out.printf("Ingrese su cédula: ");
        String cedula1 = sc.nextLine();
        estudiante1.setCedula(cedula1);
        System.out.printf("Ingrese su dirección: ");
        String direccion1 = sc.nextLine();
        estudiante1.setDireccion(direccion1);

        System.out.println("\nDOCENTE");
        System.out.printf("Ingrese su cédula: ");
        String cedula2 = sc.nextLine();
        docente1.setCedula(cedula2);
        System.out.printf("Ingrese su dirección: ");
        String direccion2 = sc.nextLine();
        docente1.setDireccion(direccion2);

        System.out.println("\n---------- INFORMACIÓN ----------");
        System.out.println("ESTUDIANTE");
        estudiante1.mostrarInformacion();
        System.out.printf("\nDOCENTE");
        docente1.mostrarInformacion();
    }
}
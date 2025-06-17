package Practica4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //objeto scanner
        Scanner sc = new Scanner(System.in);
        Persona persona1 = new Persona();

        System.out.printf("Ingrese la edad para actualizar: ");
        int edad = sc.nextInt();
        persona1.setEdad(edad);
    }
}
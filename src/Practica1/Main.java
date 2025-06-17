package Practica1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // crear objeto
        Vehiculo carro = new Vehiculo("ABC-1234");
        System.out.println("Kilometraje inicial del auto con placas '" + carro.getPlaca() + "': "+ carro.getKilometraje());
        System.out.printf("Ingrese el kilometraje del auto: ");
        double kilometraje = sc.nextDouble();
        carro.setKilometraje(kilometraje);
        System.out.println("Kilometraje actual: " +carro.getKilometraje());
    }
}
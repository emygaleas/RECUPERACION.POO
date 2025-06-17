package Practica4;

public class Persona {
    private int edad;

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad inválida, no actualizada");
        }else{
            this.edad = edad;
            System.out.printf("Edad actualizada correctamente.");
        }
    }
}

package Practica3;

public class Estudiante extends Persona{
    private String carrera;
    private String semestre;

    public Estudiante(String nombre, String cedula, String direccion, String carrera, String semestre) {
        super(nombre, cedula, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Estudiante(String nombre, String carrera, String semestre) {
        super(nombre);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Dirección " + getDireccion());
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
}

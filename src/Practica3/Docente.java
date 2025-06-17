package Practica3;

public class Docente extends Persona{
    public int numeroMaterias;
    public Docente(String nombre, String cedula, String direccion, int numeroMaterias) {
        super(nombre, cedula, direccion);
        this.numeroMaterias = numeroMaterias;
    }
    public Docente(String nombre, int numeroMaterias) {
        super(nombre);
        this.numeroMaterias = numeroMaterias;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Dirección " + getDireccion());
        System.out.println("N° de Materias a cargo: " + numeroMaterias);
    }
}

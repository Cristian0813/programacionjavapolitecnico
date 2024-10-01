package ProgramacionOrientadaObjetos;

public class Perro {
    
    String raza;
    String nombre;
    int edad;
    String encargado;
    
    public Perro() {
        raza = "Perro";
        nombre = "Luna";
        edad = 11;
        encargado = "Crispeta";
    }
    
    public void ladrar() {
        System.out.println("Gua!, Gua!");
    }
    
    public void pasear() {
        System.out.println("Ir al parque");
    }

    // Método para mostrar información del perro
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
        System.out.println("Encargado: " + encargado);
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        System.out.println("Información del perro:");
        miPerro.mostrarInfo();
        System.out.println("\nAcciones del perro:");
        miPerro.ladrar();
        miPerro.pasear();
    }
}

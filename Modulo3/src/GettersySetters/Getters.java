package GettersySetters;

public class Getters {
    
    // Atributos privados
    private String nombre;
    private int edad;
    private String encargado;

    // Constructor para inicializar los atributos
    public Getters(String nombre, int edad, String encargado) {
        this.nombre = nombre;
        this.edad = edad;
        this.encargado = encargado;
    }

    // Constructor sin argumentos
    public Getters() {
        this.nombre = "";
        this.edad = 0;
        this.encargado = "";
    }

    // Método getter para 'nombre'
    public String getNombre() {
        return nombre; // Retorna el valor de 'nombre'
    }

    // Método getter para 'edad'
    public int getEdad() {
        return edad; // Retorna el valor de 'edad'
    }
    
    // Método getter para 'encargado'
    public String getEncargado() {
        return encargado; // Retorna el valor de 'encargado'
    }

    // Método setter para 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método setter para 'edad'
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método setter para 'encargado'
    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Getters
        Getters miPerro = new Getters();
        
        // Establecer valores usando los setters
        miPerro.setNombre("Luna");
        miPerro.setEdad(5);
        miPerro.setEncargado("Cristian Arias");
        
        // Obtener y mostrar los valores usando los getters
        System.out.println("El nombre del animalito es: " + miPerro.getNombre());
        System.out.println("La edad del animalito es: " + miPerro.getEdad());
        System.out.println("El encargado del animalito es: " + miPerro.getEncargado());
    }
}
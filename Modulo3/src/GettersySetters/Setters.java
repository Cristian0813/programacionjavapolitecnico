/* Setters: 
hacen referencia a la acción de «establecer», sirven para asignar un valor 
inicial a un atributo, pero de forma explícita; además, el setter nunca 
retorna nada (siempre asigna) y solo permite dar acceso público a ciertos 
atributos que el usuario pueda modificar.
*/

package GettersySetters;


public class Setters {
    
     // Atributos privados
    private String nombre;
    private int edad;

    // Método setter para 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna el valor del parámetro al atributo
    }

    // Método setter para 'edad'
    public void setEdad(int edad) {
        if (edad >= 0) { // Validación para asegurar que la edad sea positiva
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Método para mostrar la información de la persona
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Persona
        Setters persona1 = new Setters();

        // Establecer valores usando los setters
        persona1.setNombre("Cristian");
        persona1.setEdad(25);

        // Mostrar la información de la persona
        persona1.mostrarInfo();
    }
}

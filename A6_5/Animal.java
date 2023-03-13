package A6_5;

/**
 * Esta clase abstracta es una clase que modela animales
 * @author Antoniobox
 * @since 2023-03-08
 * @version 1.0
 */
public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void presentarse(){
        System.out.println("Hola, me llamo " + nombre);
    }

    public abstract void hablar();
}

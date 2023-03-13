package A6_5;

/**
 * Clase Gato que hereda de la clase Animal, incluyendo el atributo de nombre
 * @version 1.0
 * @author Antoniobox
 * @since 2023-03-08
 */
public class Gato extends Animal{
    Gato(String nombre) {
        super(nombre);
    }
    @Override
    public void hablar() {
        System.out.println("Miau");
    }
}

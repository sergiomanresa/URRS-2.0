package A6_5;

/**
 * Clase Perro que hereda de Animal, con un atributo de nombre
 * @version 1.0
 * @author Antoniobox
 * @since 2023-03-08
 */
public class Perro extends Animal{
    public Perro(String nombre){
        super(nombre);
    }

    @Override
    public void hablar(){
        System.out.println("Guau");
    }
}
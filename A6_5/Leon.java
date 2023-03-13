package A6_5;

/**
 * Clase Leon que hereda de la clase Animal, cuenta con un atributo de su nombre
 * @version 1.0
 * @since 2023-03-08
 * @author Antoniobox
 */
public class Leon extends Animal{
    public Leon(String nombre){
        super(nombre);
    }

    @Override
    public void hablar(){
        System.out.println("GRRRRR");
    }
}

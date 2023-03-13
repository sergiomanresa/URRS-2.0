package A6_5;

/**
 * Clase Pajaro que hereda de la clase Animal, con el atributo nombre
 */
public class Pajaro extends Animal{
    Pajaro(String nombre) {
        super(nombre);
    }
    @Override
    public void hablar() {
        System.out.println("Pio");
    }
}

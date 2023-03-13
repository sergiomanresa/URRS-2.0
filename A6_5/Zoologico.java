package A6_5;

import java.util.ArrayList;

/**
 * Clase zoológico
 * @author Antoniobox
 * @version 1.0
 * @since 2023-03-08
 */
public class Zoologico {
    private String nombre;

    ArrayList<Animal> animales;
    public Zoologico(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    /**
     * Muestra por pantalla el sonido de cada uno de los animales del zoologico
     */
    public void visitar(){
        for(Animal anim : animales){
            anim.hablar();
        }
    }

    /**
     * Muestra por pantalla si en el zoológico se encuentran dos o más leones
     */
    public void calificacion(){
        int leones = 0;
        for(Animal anim : animales){
            if(anim instanceof Leon){
                leones++;
            }
        }
        System.out.println(leones < 2 ? "INOFENSIVO" : "PELIGROSO");
    }

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<Animal>();
        animales.add(new Perro("Toby"));
        animales.add(new Pajaro("Patricio"));
        animales.add(new Leon("Leonardo"));
        Zoologico zoo = new Zoologico(animales);
        zoo.visitar();
        zoo.calificacion();
    }
}

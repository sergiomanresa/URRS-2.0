package Azul1;
/*
Crear una clase Huevo que tiene dos clases internas Clara y Yema
respectivamente. La Clara tiene un atributo proteínas de tipo entero, y la Yema
tiene un atributo color. El huevo va a tener dos métodos, uno que es dameClara
que devuelve la Clara, y otro que es dameYema.
 */

/**
 * Clase que representa a un huevo, contieniendo en su interior la clase Clara y la clase Yema
 * @author Antoniobox
 * @version 1.0
 * @since 28/02/2023
 */
public class Huevo {
    class Clara{
        int proteinas;

        public Clara(int proteinas) {
            this.proteinas = proteinas;
        }
    }
    class Yema{
        String color;

        public Yema(String color) {
            this.color = color;
        }
    }
    public Clara dameClara(){
        return new Clara(5);
    }
    public Yema dameYema(){
        return new Yema("Amarillo");
    }
}

package Super;

public class Figura {
    String nombre;
    String color;

    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
    }
}

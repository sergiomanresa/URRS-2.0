package Figuras;

public abstract class Figura {
    protected String nombre;
    protected String color;
    protected int posicion;

    public Figura(String nombre, String color, int posicion) {
        this.nombre = nombre;
        this.color = color;
        this.posicion = posicion;
    }
    public abstract void mostrar();
}

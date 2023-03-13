package Figuras;

public class Rectangulo extends Figura implements Calculable, Dibujable{
    public Rectangulo(String nombre, String color, int posicion) {
        super(nombre, color, posicion);
    }

    @Override
    public float calcularArea() {
        return 0;
    }

    @Override
    public float calcularPerimetro() {
        return 0;
    }

    @Override
    public void mostrar() {

    }

    @Override
    public void setPosition(int posicion) {
        super.posicion = posicion;
    }

    @Override
    public void dibujar() {
        System.out.println("Rectangulo dibujado");
    }
}

package Figuras;

public class Cuadrado extends Figura implements Calculable, Dibujable{

    private int lado;
    public Cuadrado(String nombre, String color, int posicion, int lado) {
        super(nombre, color, posicion);
        this.lado = lado;
    }

    @Override
    public void mostrar() {
        System.out.println("VALORES: ");
        System.out.println(nombre+"\n"+color+"\n"+posicion+"\n"+"Lado: "+lado);
    }

    @Override
    public float calcularArea() {
        return lado * lado;
    }

    @Override
    public float calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public void setPosition(int posicion) {
        super.posicion = posicion;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Cuadrado");
    }
}

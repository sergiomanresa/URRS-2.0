package Super;

public class Cuadrado extends Figura{
    int lado;
    Cuadrado(String nombre, String color, int lado){
        super(nombre, color);
        this.lado = lado;
    }

    void mostrar(){
        super.mostrar();
        System.out.println("Lado: "+lado);
    }

    int calcularArea(){
        return lado*lado;
    }
}

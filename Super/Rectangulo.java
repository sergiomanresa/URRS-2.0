package Super;

public class Rectangulo extends Figura{
    int base;
    int altura;

    Rectangulo(String nombre, String color, int base, int altura){
        super(nombre, color);
        this.base = base;
    }

    void mostrar(){
        super.mostrar();
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
    }

    int calcularArea(){
        return base * altura;
    }
}

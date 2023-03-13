package Super;

public class Triangulo extends Figura{
    int base;
    int altura;
    Triangulo(String nombre, String color, int base, int altura){
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    void mostrar(){
        super.mostrar();
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
    }

    int calcularArea(){
        return (base*altura)/2;
    }
}

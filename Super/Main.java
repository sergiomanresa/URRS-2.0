package Super;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Triangulo", "Blanco", 4, 5);
        triangulo.mostrar();
        System.out.println(triangulo.calcularArea());
    }
}

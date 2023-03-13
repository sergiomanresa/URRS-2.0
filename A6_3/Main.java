package A6_3;

public class Main {
    public static void main(String[] args) {
        Comercial comercial = new Comercial("Juan", 20, 15.40, 87);
        Secretario secretario = new Secretario("Paco", 20, 15.40, 90);
        comercial.setKilometrosRecorridos(2000);

        System.out.println(secretario.calcularSueldo(160));
        System.out.println(comercial.calcularSueldo(160));
    }
}

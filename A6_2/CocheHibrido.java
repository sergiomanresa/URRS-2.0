package A6_2;

public class CocheHibrido extends Coche {
    private int bateria;
    private int deposito;

    CocheHibrido(String marca, String color, int numRuedas, int bateria, int deposito) {
        super(marca, color, numRuedas);
        this.bateria = bateria;
        this.deposito = deposito;
    }

    @Override
    public void correr() {
        System.out.println("Corriendo");
    }

}

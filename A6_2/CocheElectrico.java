package A6_2;

public class CocheElectrico extends Coche{

    private int bateria;
    CocheElectrico(String marca, String color, int numRuedas, int bateria) {
        super(marca, color, numRuedas);
        this.bateria = bateria;
    }

    @Override
    public void correr() {

    }
}

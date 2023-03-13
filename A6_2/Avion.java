package A6_2;

public class Avion extends Vehiculo{

    private int helices;


    public Avion(String marca, String color, int helices) {
        super(marca, color);
        this.helices = helices;
    }

    void setHelices(int helices) {
        this.helices = helices;
    }

    int getHelices() {
        return helices;
    }
}

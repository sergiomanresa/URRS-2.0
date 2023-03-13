package A6_2;

public abstract class Coche extends Vehiculo {
    int numRuedas;

    Coche(String marca, String color, int numRuedas){
        super(marca, color);
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas(){
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas){
        this.numRuedas = numRuedas;
    }

    @Override
    public String toString(){
        return "Coche{" + "numRuedas=" + numRuedas + '}';
    }

    public abstract void correr();
}

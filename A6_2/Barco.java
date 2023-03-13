package A6_2;

public class Barco extends Vehiculo{
    float eslora;
    Barco(String marca, String color, float eslora){
        super(marca, color);
        this.eslora = eslora;
    }

    public float getEslora(){
        return eslora;
    }

    public void setEslora(float eslora){
        this.eslora = eslora;
    }

    @Override
    public String toString(){
        return super.toString() + " eslora: " + eslora;
    }
}

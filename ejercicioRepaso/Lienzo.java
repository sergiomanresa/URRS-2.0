package ejercicioRepaso;

public class Lienzo extends Foto {
    private boolean conMarco;
    private String tipoMarco;
    public Lienzo(String medidas, String nombre, double precio, boolean conMarco, String tipoMarco) {
        super(medidas, nombre, precio);
        this.conMarco = conMarco;
        this.tipoMarco = tipoMarco;
    }
    public boolean isConMarco() {
        return conMarco;
    }
    public void setConMarco(boolean conMarco) {
        this.conMarco = conMarco;
    }
    public String getTipoMarco() {
        return tipoMarco;
    }
    public void setTipoMarco(String tipoMarco) {
        this.tipoMarco = tipoMarco;
    }
    void mostrar() {
        super.mostrar();
        System.out.println(this.conMarco);
        System.out.println(this.tipoMarco);
    }
}

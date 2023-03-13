package ejercicioRepaso;

public class Tarjeta extends Foto{
    private String texto;
    private String fondo;
    Tarjeta(String nombre, String medidas, double precio, String texto, String fondo){
        super(nombre, medidas, precio);
        this.texto = texto;
        this.fondo = fondo;
    }
    public String getTexto(){
        return texto;
    }
    public String getFondo(){
        return fondo;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
    public void setFondo(String fondo){
        this.fondo = fondo;
    }
    void mostrar(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Medidas: "+this.getMedidas());
        System.out.println("Precio: "+this.getPrecio());
        System.out.println("Texto: "+this.getTexto());
        System.out.println("Fondo: "+this.getFondo());
    }
    @Override
    public void descuento(){

    }
}

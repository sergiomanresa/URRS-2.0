package ejercicioRepaso;

/**
 * Clase que representa una foto
 * @author Antoniobox
 * @version 1.0
 * @since 2023-03-02
 */
public class Foto {
    private String medidas;
    private String nombre;
    private double precio;

    Foto(String medidas, String nombre, double precio) {
        this.medidas = medidas;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getMedidas() {
        return medidas;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    void mostrar() {
        System.out.println("Medidas: " + medidas);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }

    public void descuento(){
        this.precio -= precio * 0.2;
    }
}

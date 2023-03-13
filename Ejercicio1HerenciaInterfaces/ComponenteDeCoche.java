package Ejercicio1HerenciaInterfaces;

public class ComponenteDeCoche {
    private String descripcion;
    private int peso;
    private double coste;

    public ComponenteDeCoche(String descripcion, int peso, double coste) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.coste = coste;
    }

    public void mostrar(){
        System.out.println(descripcion);
        System.out.println(peso);
        System.out.println(coste);
    }
}

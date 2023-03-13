package Ejercicio1HerenciaInterfaces;

public class PuertaCoche extends ComponenteDeCoche implements Puerta, Alarma{
    private boolean estaBloqueada;
    private boolean alarmaActiva;

    public PuertaCoche(String descripcion, int peso, double coste) {
        super(descripcion, peso, coste);
    }

    public boolean estaBloqueada() {
        return estaBloqueada;
    }

    @Override
    public boolean estaLaAlarmaActivada() {
        return alarmaActiva;
    }

    @Override
    public void activarAlarma() {
        alarmaActiva = true;
    }

    @Override
    public void desactivarAlarma() {
        alarmaActiva = false;
    }

    @Override
    public void abrir() {
        if(estaBloqueada){
            System.out.println("No se puede abrir");
        }
    }

    @Override
    public void cerrar() {
        estaBloqueada = true;
        alarmaActiva = true;
    }
}

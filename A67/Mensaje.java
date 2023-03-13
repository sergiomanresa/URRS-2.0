package A67;

public class Mensaje {
    protected String mensaje;
    private String destinoremitente;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDestinoremitente() {
        return destinoremitente;
    }

    public void setDestinoremitente(String destinoremitente) {
        this.destinoremitente = destinoremitente;
    }

    Mensaje(String mensaje, String destinoremitente){
        this.mensaje = mensaje;
        this.destinoremitente = destinoremitente;
    }

    String enviarMensaje(){
        System.out.println("Mensaje: "+mensaje);
        return mensaje;
    }

    void recibirMensaje(String mensaje){
        System.out.println("Mensaje recibido: "+mensaje);
    }
}

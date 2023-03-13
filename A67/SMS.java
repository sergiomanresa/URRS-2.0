package A67;

public class SMS extends Mensaje{
    SMS(String mensaje, String destinoremitente) {
        super(mensaje, destinoremitente);
    }

    @Override
    String enviarMensaje(){
        System.out.println("Mensaje: "+mensaje);
        return mensaje;
    }
}

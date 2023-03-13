package A67;

public class Email extends Mensaje{
    int archivo;

    Email(String mensaje, String destinoremitente, int archivo) {
        super(mensaje, destinoremitente);
        this.archivo = archivo;
    }

    @Override
    public String enviarMensaje(){
        System.out.println("Mensaje: "+mensaje+"\t"+"Fichero: "+archivo);
        return mensaje;
    }
}

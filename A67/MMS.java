package A67;


public class MMS extends Mensaje{
    private String foto;
    MMS(String mensaje, String destinoremitente, String foto) {
        super(mensaje, destinoremitente);
        this.foto = foto;
    }

    @Override
    String enviarMensaje(){
        System.out.println("Email: " +mensaje + "\tFoto: " +foto);
        return mensaje;
    }
}

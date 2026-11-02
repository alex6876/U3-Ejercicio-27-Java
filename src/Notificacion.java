public class Notificacion {

    protected String mensaje;
    protected String fechaEnvio;

    public Notificacion(String mensaje, String fechaEnvio) {
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
    }

    public void enviar() {
        System.out.println("Enviando notificación...");
    }
}

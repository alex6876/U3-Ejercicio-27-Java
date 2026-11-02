public class NotificacionEmail extends Notificacion {

    private String direccionCorreo;

    public NotificacionEmail(String mensaje, String fechaEnvio,
                             String direccionCorreo) {

        super(mensaje, fechaEnvio);

        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviar() {

        System.out.println("=== NOTIFICACIÓN EMAIL ===");
        System.out.println("Conectando con servidor de correo...");
        System.out.println("Destinatario: " + direccionCorreo);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Fecha: " + fechaEnvio);
        System.out.println("Correo enviado correctamente.");
    }
}

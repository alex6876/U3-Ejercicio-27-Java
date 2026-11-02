public class NotificacionSMS extends Notificacion {

    private String numeroTelefono;

    public NotificacionSMS(String mensaje, String fechaEnvio,
                           String numeroTelefono) {

        super(mensaje, fechaEnvio);

        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar() {

        System.out.println("=== NOTIFICACIÓN SMS ===");
        System.out.println("Conectando con servicio SMS...");
        System.out.println("Número: " + numeroTelefono);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Fecha: " + fechaEnvio);
        System.out.println("SMS enviado correctamente.");
    }
}

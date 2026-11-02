public class NotificacionPush extends Notificacion {

    private String identificadorDispositivo;

    public NotificacionPush(String mensaje, String fechaEnvio,
                            String identificadorDispositivo) {

        super(mensaje, fechaEnvio);

        this.identificadorDispositivo = identificadorDispositivo;
    }

    @Override
    public void enviar() {

        System.out.println("=== NOTIFICACIÓN PUSH ===");
        System.out.println("Conectando con servicio de notificaciones...");
        System.out.println("Dispositivo: " + identificadorDispositivo);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Fecha: " + fechaEnvio);
        System.out.println("Notificación push enviada correctamente.");
    }
}

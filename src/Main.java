public class Main {

    public static void main(String[] args) {

        NotificacionEmail email = new NotificacionEmail(
                "Tu compra fue confirmada.",
                "02/11/2026",
                "usuario@gmail.com"
        );

        NotificacionSMS sms = new NotificacionSMS(
                "Tu código de verificación es 123456.",
                "02/11/2026",
                "2615551234"
        );

        NotificacionPush push = new NotificacionPush(
                "Tienes una nueva actualización.",
                "02/11/2026",
                "DEVICE-001"
        );

        email.enviar();

        System.out.println();

        sms.enviar();

        System.out.println();

        push.enviar();
    }
}

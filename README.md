Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Sistema de Notificaciones Multicanal (Herencia, Sobrescritura y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🔔 Simulación de Sistema de Notificaciones Multicanal (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema integral de alertas y mensajería, implementando una jerarquía de clases mediante herencia para administrar distintos canales de envío (correo electrónico, mensajes de texto SMS y notificaciones push en dispositivos). Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la reutilización de constructores mediante `super`, la sobrescritura polimórfica de métodos (`@Override`) y la ejecución especializada de comportamientos de comunicación en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general y sus respectivas subclases especializadas, acompañadas por un punto de ejecución:

* **`Notificacion`**: Clase base que centraliza los atributos y comportamientos comunes de cualquier mensaje enviado por el sistema.
* **Atributos protegidos (`protected`)**: `mensaje` y `fechaEnvio`, permitiendo que las clases hijas accedan directamente al contenido y la marca temporal de la notificación.
* **Constructor**: Inicializa los datos comunes de la notificación.
* **Método operativo**: `enviar()` como comportamiento base genérico, diseñado para ser completamente especializado por las subclases.


* **`NotificacionEmail`**: Extiende de `Notificacion` para modelar envíos a través del correo electrónico.
* **Atributo privado (`private`)**: `direccionCorreo`.
* **Constructor**: Invoca a `super(mensaje, fechaEnvio)` para inicializar los campos heredados y configura el correo del destinatario.
* **Sobrescritura (`@Override`)**: Implementa el método `enviar()` simulando la conexión con un servidor SMTP y detallando el envío específico al correo.


* **`NotificacionSMS`**: Extiende de `Notificacion` para modelar mensajes de texto móviles.
* **Atributo privado (`private`)**: `numeroTelefono`.
* **Constructor**: Utiliza `super(...)` y asigna el número telefónico del destinatario.
* **Sobrescritura (`@Override`)**: Adapta el comportamiento de `enviar()` simulando la conexión con una pasarela de SMS y mostrando los datos correspondientes.


* **`NotificacionPush`**: Extiende de `Notificacion` para modelar alertas emergentes en dispositivos móviles o aplicaciones.
* **Atributo privado (`private`)**: `identificadorDispositivo`.
* **Constructor**: Utiliza `super(...)` y asigna el identificador único del equipo receptor.
* **Sobrescritura (`@Override`)**: Personaliza el método `enviar()` simulando la conexión con un servicio de notificaciones push para el dispositivo destino.


* **`Main`**: Punto de entrada del programa. Instancia un objeto de tipo `NotificacionEmail`, un `NotificacionSMS` y un `NotificacionPush` con datos reales de prueba, y ejecuta de forma secuencial el método `enviar()` sobre cada uno para demostrar la resolución polimórfica de los mensajes impresos por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Reutilización de Contenido por Herencia:** La información base de cualquier mensaje (`mensaje` y `fechaEnvio`) se gestiona de forma centralizada en la superclase, evitando duplicación en los distintos canales de comunicación.
2. **Polimorfismo en el Comportamiento de Envío:** Aunque todas las clases comparten la firma del método `enviar()`, cada subclase ejecuta una lógica adaptada a su tecnología (correo, SMS o push), permitiendo extender nuevos canales de forma limpia.
3. **Encapsulamiento de Datos Sensibles:** Los detalles particulares de direccionamiento (`direccionCorreo`, `numeroTelefono`, `identificadorDispositivo`) permanecen protegidos como atributos privados en cada canal respectivo.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
=== NOTIFICACIÓN EMAIL ===
Conectando con servidor de correo...
Destinatario: usuario@gmail.com
Mensaje: Tu compra fue confirmada.
Fecha: 02/11/2026
Correo enviado correctamente.

=== NOTIFICACIÓN SMS ===
Conectando con servicio SMS...
Número: 2615551234
Mensaje: Tu código de verificación es 123456.
Fecha: 02/11/2026
SMS enviado correctamente.

=== NOTIFICACIÓN PUSH ===
Conectando con servicio de notificaciones...
Dispositivo: DEVICE-001
Mensaje: Tienes una nueva actualización.
Fecha: 02/11/2026
Notificación push enviada correctamente.

```

---

## 🚀 Conceptos de Programación Aplicados

* **Jerarquía Multicanal:** Modelado robusto de arquitecturas de comunicación mediante una estructura limpia de herencia orientada a objetos.
* **Polimorfismo y Sobrescritura (`@Override`):** Capacidad de invocar un comportamiento genérico que se adapta dinámicamente según la naturaleza específica de cada subclase.
* **Diseño Modular:** Clara separación entre el dominio de notificaciones y la ejecución de casos de prueba simulados en el cliente (`Main`).

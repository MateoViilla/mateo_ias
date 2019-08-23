package Notificadores;

import Interfaces.INotificador;

public class Correo implements INotificador {

    private INotificador siguienteNotificador;

    public Correo(INotificador notificador) {
        setSiguienteNotificador(notificador);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Notificó a Correo con Mensaje" + mensaje);
        if (this.siguienteNotificador != null) {
            System.out.println("enviar mensaje de siguiente notificador");
            this.siguienteNotificador.enviar(mensaje);
        } else System.out.println("Fin de las notificaciones");
    }

    private void setSiguienteNotificador(INotificador notificador) {
        this.siguienteNotificador = notificador;
    }
}

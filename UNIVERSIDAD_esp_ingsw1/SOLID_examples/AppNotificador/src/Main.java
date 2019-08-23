import Interfaces.INotificador;
import Notificadores.Correo;
import Notificadores.Facebook;
import Notificadores.SMS;
import Notificadores.SistemaMensajeEmpresarial;

public class Main {

    public static void main(String[] args) {
        INotificador correo = new Correo(new Facebook(new SMS(new SistemaMensajeEmpresarial(null))));
        correo.enviar(" " +
                "HOLA COMO ESTAS ?");
    }
}

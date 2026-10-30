package factoryMethod;

public class NotificacaoEmail implements INotificacao {
    public String enviar() {
        return "Enviar Notificação do Email";
    }

    public String receber() {
        return "Receber Notificação do Email";
    }
}

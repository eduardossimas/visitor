package factoryMethod;

public class NotificacaoWhatsApp implements INotificacao {
    public String enviar() {
        return "Enviar Notificação do WhatsApp";
    }

    public String receber() {
        return "Receber Notificação do WhatsApp";
    }
}

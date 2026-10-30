package factoryMethod;

public class NotificacaoFactory {
    public static INotificacao obterNotificacao(String notificacao) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("factoryMethod.Notificacao" + notificacao);
            objeto = classe.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Notificação inexistente");
        }

        if (!(objeto instanceof INotificacao)) {
            throw new IllegalArgumentException("Notificação inválida");
        }

        return (INotificacao) objeto;
    }
}

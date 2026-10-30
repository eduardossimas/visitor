package singleton;

public class Parametros {
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String senhaUnica;

    public String getSenhaUnica() {
        return senhaUnica;
    }

    public void setSenhaUnica(String senhaUnica) {
        this.senhaUnica = senhaUnica;
    }
}

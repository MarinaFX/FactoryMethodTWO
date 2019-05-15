package ConcreteFactory;

import AbstractFactory.ABSProvedoraFactory;
import Provedoras.Privada;
import Provedoras.Publica;

public class ProvedoraFactory implements ABSProvedoraFactory {
    private static final String PASSWORD = "designpatterns";
    private boolean knowsPassword = false;
    private static boolean emptyConstructor;

    public ProvedoraFactory(String password) {
        knowsPassword = PASSWORD.equals(password);
    }

    public ProvedoraFactory() {
        emptyConstructor = true;
    }

    @Override
    public void provedoraInfo() {
        if ((knowsPassword) && !(emptyConstructor))
            new Privada();
        else
            new Publica();
    }
}

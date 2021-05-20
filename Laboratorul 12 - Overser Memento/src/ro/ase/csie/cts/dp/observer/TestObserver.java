package ro.ase.csie.cts.dp.observer;

public class TestObserver {

    public static void main(String[] args) {
        ModulStareConexiuneServer conexiune = new ModulStareConexiuneServer();

        ModulNotificariUI notificari = new ModulNotificariUI();
        ModulSalvareaAutomata backup = new ModulSalvareaAutomata();

        conexiune.detectieSchimbareStareConexiune(StareConexiune.ACTIVA);

        conexiune.register(backup);
        conexiune.register(notificari);

        conexiune.detectieSchimbareStareConexiune(StareConexiune.INACTIVA);

        conexiune.unregister(backup);

        conexiune.detectieSchimbareStareConexiune(StareConexiune.ACTIVA);
    }
}

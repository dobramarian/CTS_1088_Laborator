package ro.ase.csie.cts.dp.command;

public class Update implements InterfataModulJoc{
    @Override
    public void executaTask(String detalii) {
        System.out.println("Start update joc pentru versiunea " + detalii);
    }
}

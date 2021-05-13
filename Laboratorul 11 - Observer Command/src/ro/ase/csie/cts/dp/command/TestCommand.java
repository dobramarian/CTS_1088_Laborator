package ro.ase.csie.cts.dp.command;

public class TestCommand {
    public static void main(String[] args) {
        ManagerTaskuri manager = new ManagerTaskuri();

        manager.adaugaTask(new TaskAsincron(new Update(), "10.1.1", 5));
        manager.adaugaTask(new TaskAsincron(new ModulAutoSave(), "Salvare automata nivel 5", 11));

        System.out.println("Jocul continua...");

        manager.executaUrmatorulTask();

        System.out.println("Jocul continua...");

        manager.executaUrmatorulTask();

        System.out.println("Jocul continua...");
    }
}

package ro.ase.csie.cts.dp.strategy.state;

public class StareDeplasareRanitCritic implements InterfataModDeplasare{

    @Override
    public void seMisca(SuperErou erou) {
        System.out.println(erou.nume + " nu se poate deplasa");
    }
}

package ro.ase.csie.cts.dp.strategy.state;

public class StareDeplasareNormala implements  InterfataModDeplasare{
    @Override
    public void seMisca(SuperErou erou) {
        System.out.println(erou.nume + " alearga");
    }
}

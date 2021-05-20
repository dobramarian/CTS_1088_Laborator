package ro.ase.csie.cts.dp.memento;

import java.util.Date;

public class MementoSuperErou {
    String nume;
    int puncteViata;
    String magie;

    Date dataSalvere;

    public MementoSuperErou(String nume, int puncteViata, String magie) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.magie = magie;
        this.dataSalvere = new Date();
    }
}

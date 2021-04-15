package ro.ase.csie.cts.laborator.dp.decorator;

public abstract class SuperErou {

    String nume;
    int puncteViata;

    public SuperErou(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;
    }

    public abstract int getPuncteViata();
    public abstract void alearga();
    public abstract void esteLovit(int puncte);
    public abstract void seVindeca(int puncte);
}

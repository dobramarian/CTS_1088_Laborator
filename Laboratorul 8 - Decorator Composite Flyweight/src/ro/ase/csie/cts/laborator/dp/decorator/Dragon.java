package ro.ase.csie.cts.laborator.dp.decorator;

public class Dragon extends SuperErou{


    public Dragon(String nume, int puncteViata) {
        super(nume, puncteViata);
    }

    @Override
    public void alearga() {
        System.out.println("Zboara catre o noua destinatie!");
    }

    @Override
    public void esteLovit(int puncte) {
        System.out.printf("%s este lovit si pierde %d puncte%n",this.nume,puncte);
        this.puncteViata -= puncte;
    }

    @Override
    public void seVindeca(int puncte) {
        System.out.printf("%s se vindeca si recupereaza %d puncte%n",this.nume,puncte);
        this.puncteViata += puncte;
    }

    @Override
    public int getPuncteViata() {
        return this.puncteViata;
    }
}

package ro.ase.cts.laborator.dp.factory;

public class CaracterDisney extends CaracterAbstract{

    String culoare;
    boolean okPentruCopiiMici;

    public CaracterDisney(String nume, String culoare, boolean ok) {
        this.nume = nume;
        this.culoare = culoare;
    }

    @Override
    public void alearga() {
        System.out.println("Alearga...");
    }

    @Override
    public void sare() {
        System.out.println("Sare...");
    }
}

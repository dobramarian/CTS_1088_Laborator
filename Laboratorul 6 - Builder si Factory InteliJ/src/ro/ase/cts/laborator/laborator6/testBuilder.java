package ro.ase.cts.laborator.laborator6;

public class testBuilder {

    public static void main(String[] args) {
        SuperErou superman = new SuperErou.SuperErouBuilder("Superman",100).build();
        SuperErou joker = new SuperErou.SuperErouBuilder("Joker",200)
                .esteNegativ()
                .esteRanit()
                .setArmaDreapta(new Arma())
                .build();
    }

}

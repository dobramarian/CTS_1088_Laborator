package ro.ase.cts.laborator.dp.builder;

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

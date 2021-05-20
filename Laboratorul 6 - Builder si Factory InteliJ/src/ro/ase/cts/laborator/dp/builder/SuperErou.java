package ro.ase.cts.laborator.dp.builder;

public class SuperErou {
    private String nume;
    private int puncteViata;

    private boolean esteErouNegativ;
    private boolean esteRanit;

    private InterfataArma armaStanga;
    private InterfataArma armaDreapta;

    private  InterfataSuperPutere superPutere;
    private  InterfataSuperPutere superSuperPutere;

    private  SuperErou() {
    }

    public String getNume() {
        return nume;
    }

    public int getPuncteViata() {
        return puncteViata;
    }

    public boolean isEsteErouNegativ() {
        return esteErouNegativ;
    }

    public boolean isEsteRanit() {
        return esteRanit;
    }

    public InterfataArma getArmaStanga() {
        return armaStanga;
    }

    public InterfataArma getArmaDreapta() {
        return armaDreapta;
    }

    public InterfataSuperPutere getSuperPutere() {
        return superPutere;
    }

    public InterfataSuperPutere getSuperSuperPutere() {
        return superSuperPutere;
    }

    public static class SuperErouBuilder{
        SuperErou superErou = null;

        public SuperErouBuilder(String nume,int puncteViata){
            superErou = new SuperErou();
            superErou.nume=nume;
            superErou.puncteViata=puncteViata;
        }

        public SuperErouBuilder esteNegativ(){
            this.superErou.esteErouNegativ = true;
            return this;
        }

        public SuperErouBuilder esteRanit(){
            this.superErou.esteRanit = true;
            return this;
        }

        public SuperErouBuilder setArmaDreapta(InterfataArma arma){
            this.superErou.armaDreapta = arma;
            return this;
        }

        public SuperErouBuilder setArmaStanga(InterfataArma arma){
            this.superErou.armaStanga = arma;
            return this;
        }

        public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere){
            this.superErou.superPutere = superPutere;
            return this;
        }

        public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superSuperPutere){
            this.superErou.superSuperPutere = superSuperPutere;
            return this;
        }

        public SuperErou build(){
            return  superErou;
        }
    }
}

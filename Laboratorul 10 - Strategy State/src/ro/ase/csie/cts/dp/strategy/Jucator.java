package ro.ase.csie.cts.dp.strategy;

public class Jucator {

    int totalOreJucate;
    String nume;
    int clasaJucator;

    InterfataStrategieMarketing strategieMarketing = null;

    public Jucator(int totalOreJucate, String nume, int clasaJucator) {
        this.totalOreJucate = totalOreJucate;
        this.nume = nume;
        this.clasaJucator = clasaJucator;
    }

    public int getTotalOreJucate() {
        return totalOreJucate;
    }

    public String getNume() {
        return nume;
    }

    public int getClasaJucator() {
        return clasaJucator;
    }

    public void setStrategieMarketing(InterfataStrategieMarketing strategieMarketing) {
        this.strategieMarketing = strategieMarketing;
    }

    public void acordaPuncteBonus(){
        if(this.strategieMarketing !=null){
            this.strategieMarketing.aplicaStrategieBonus(this);
        }
        else {
            throw new UnsupportedOperationException();
        }
    }

}

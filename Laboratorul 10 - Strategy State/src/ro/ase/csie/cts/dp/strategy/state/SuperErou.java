package ro.ase.csie.cts.dp.strategy.state;

public class SuperErou {

    public static final int PUNCTE_NIVEL_CRITIC = 50;
    public static final int PUNCTE_NIVEL_NORMAL = 500;
    int puncteViata;
    String efectMagic;
    String nume;

    InterfataModDeplasare stareDeplasare = null;

    public SuperErou(int puncteViata, String efectMagic, String nume) {
        this.puncteViata = puncteViata;
        this.efectMagic = efectMagic;
        this.nume = nume;
    }

    public SuperErou(String nume) {
        super();
        this.nume = nume;
        this.puncteViata = PUNCTE_NIVEL_NORMAL;
        this.stareDeplasare = new StareDeplasareNormala();
    }

    public void esteAtacat(int puncteLovitura){
        System.out.println(this.nume+ " este lovit cu "+ puncteLovitura);
        this.puncteViata -= puncteLovitura;
        if(this.puncteViata < PUNCTE_NIVEL_CRITIC){
            this.stareDeplasare = new StareDeplasareRanitCritic();
        }
        else
            if(this.puncteViata <PUNCTE_NIVEL_NORMAL){
              this.stareDeplasare = new StareDeplasareRanit();
            }
    }

    public void seVindeca(int puncte){
        System.out.println("Eroul se vindeca");
        this.puncteViata += puncte;
        if(this.puncteViata >PUNCTE_NIVEL_NORMAL){
            this.stareDeplasare = new StareDeplasareNormala();
        }
        else
            if(this.puncteViata <PUNCTE_NIVEL_CRITIC){
                this.stareDeplasare = new StareDeplasareRanit();
            }
    }

    public void seDeplaseaza(){
        stareDeplasare.seMisca(this);
    }
}

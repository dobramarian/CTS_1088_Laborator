package ro.ase.csie.cts.laborator.dp.composite;

public abstract class UnitateAbstractaJoc implements InterfataNPC{

    //interfata nodurior frunza este mostenita
    //definim interfata specifica nodurilor copil

    public void adaugaCaracter(UnitateAbstractaJoc unitate){
        throw new UnsupportedOperationException();
    }

    public  void stergeCaracter(UnitateAbstractaJoc unitate){
        throw new UnsupportedOperationException();
    }

    public  UnitateAbstractaJoc getCaracter(int index){
        throw new UnsupportedOperationException();
    }
}

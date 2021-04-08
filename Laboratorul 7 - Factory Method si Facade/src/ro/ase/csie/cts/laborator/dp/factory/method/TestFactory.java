package ro.ase.csie.cts.laborator.dp.factory.method;

public class TestFactory {

    public static void main(String[] args){

        boolean isModJoc4Kids = true;

        if(isModJoc4Kids){

        }
        else {

        }
        FactoryAbstractCaracter factoryCaracter = null;
        factoryCaracter = (isModJoc4Kids) ? new FactoryMod4Kids() : new FactoryModNormal();

        //dezvoltare joc
        CaracterJoc superman = factoryCaracter.getCaracter(TipCaracter.MARVEL,"Superman");

    }
}

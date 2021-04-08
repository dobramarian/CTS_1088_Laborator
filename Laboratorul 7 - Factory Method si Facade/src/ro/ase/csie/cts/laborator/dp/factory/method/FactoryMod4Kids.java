package ro.ase.csie.cts.laborator.dp.factory.method;

public class FactoryMod4Kids extends FactoryAbstractCaracter {

    @Override
    public CaracterJoc getCaracter(TipCaracter tip, String nume) {

        CaracterJoc caracterJoc = null;
        switch (tip){
            case DISNEY:
                caracterJoc = new CaracterDisney4Kids();
                break;
            case MARVEL:
                caracterJoc = new CaracterMarvel4Kids();
                break;
            case DC:
                caracterJoc = new CaracterDCComics4Kids();
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return caracterJoc;
    }
}

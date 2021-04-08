package ro.ase.csie.cts.laborator.dp.factory.method;

public class FactoryModNormal extends FactoryAbstractCaracter {
    @Override
    public CaracterJoc getCaracter(TipCaracter tip, String nume) {

        CaracterJoc caracterJoc = null;
        switch (tip){
            case DISNEY:
                caracterJoc = new CaracterDisney(nume);
                break;
            case MARVEL:
                caracterJoc = new CaracterMarvel(nume,300);
                break;
            case DC:
                caracterJoc = new CaracterDCComics(nume);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return caracterJoc;
    }
}

package ro.ase.cts.laborator.dp.factory;

public class FactoryCaracter {

    public static CaracterAbstract getCaracter(TipCaracter tip, String nume){
        CaracterAbstract caracter = null;

        switch (tip){
            case DISNEY:
                caracter = new CaracterDisney(nume,"alb",true);
                break;
            case MARVEL:
                caracter = new CaracterMarvel(82,nume);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return caracter;
    }

}

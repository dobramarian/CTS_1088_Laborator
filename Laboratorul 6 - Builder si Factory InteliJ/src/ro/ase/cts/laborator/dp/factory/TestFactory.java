package ro.ase.cts.laborator.dp.factory;

import java.util.ArrayList;

public class TestFactory {

    public static void main(String[] args) {

//        CaracterAbstract mickeyMouse = new CaracterDisney("rosu","Mickey Mouse");
//        CaracterAbstract spiderMan = new CaracterMarvel(100,"Spiderman");

        CaracterAbstract mickeyMouse = FactoryCaracter.getCaracter(TipCaracter.DISNEY,"Mickey Mouse");

        ArrayList<CaracterAbstract> caractere = new ArrayList<>();
    }

}

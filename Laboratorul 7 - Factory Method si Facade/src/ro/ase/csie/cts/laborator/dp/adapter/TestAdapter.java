package ro.ase.csie.cts.laborator.dp.adapter;

import ro.ase.csie.cts.laborator.dp.factory.method.CaracterDisney;
import ro.ase.csie.cts.laborator.dp.factory.method.CaracterJoc;

import java.util.ArrayList;

public class TestAdapter {

    public static void main(String[] args){

        //1.colectie caractere existente
        ArrayList<CaracterJoc> caractere = new ArrayList<>();
        caractere.add(new CaracterDisney("Donald"));

        //2. colectie caractere EA
        ArrayList<InterfataCaracterEA> caractereEA = new ArrayList<>();
        caractereEA.add(new CarcaterGenericEA());

        //folosind un adapter
        InterfataCaracterEA caracterEA = new CarcaterGenericEA();
        AdapterEA2CaracterJoc adapt = new AdapterEA2CaracterJoc(caracterEA);
        caractere.add(adapt);
    }
}

package ro.ase.csie.cts.laborator.dp.adapter;

import ro.ase.csie.cts.laborator.dp.factory.method.CaracterJoc;

public class AdapterEA2CaracterJoc extends CaracterJoc {

    InterfataCaracterEA caracterEA;

    public AdapterEA2CaracterJoc(InterfataCaracterEA caracterEA) {
        this.caracterEA = caracterEA;
    }

    @Override
    public void seDeplaseaza() {

    }
}

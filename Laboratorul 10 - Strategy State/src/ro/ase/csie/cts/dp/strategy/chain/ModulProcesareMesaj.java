package ro.ase.csie.cts.dp.strategy.chain;

public abstract class ModulProcesareMesaj {

    ModulProcesareMesaj next=null;
    public abstract void procesareMesaj(MesajChat mesaj);
}

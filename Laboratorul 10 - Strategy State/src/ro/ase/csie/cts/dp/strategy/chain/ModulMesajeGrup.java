package ro.ase.csie.cts.dp.strategy.chain;

public class ModulMesajeGrup extends ModulProcesareMesaj{
    @Override
    public void procesareMesaj(MesajChat mesaj) {
        if(mesaj.destinatie.toLowerCase().equals("@everyone")){
            System.out.println("Mesaj pentru grup: " + mesaj.text);
        }

        if(this.next != null){
            this.next.procesareMesaj(mesaj);
        }
    }
}

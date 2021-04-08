package ro.ase.csie.cts.laborator.dp.facade;

public class TestFacade {

    public static void main (String[] args){
        //1. Creare conexiune
        ConexiuneServerJoc conexine = new ConexiuneServerJoc();
        conexine.conectare();

        //2. Login Player
        Player player = new Player();
        player.login(conexine);

        //3. Obinem Profilul
        ProfilPlayer profil = player.getProfil();

        //4. Obtinem datele
        String dateProfil = profil.getProfil();

        String dateProfil2 = FacadeAPIJoc.getProfil("player1","1234");
    }
}

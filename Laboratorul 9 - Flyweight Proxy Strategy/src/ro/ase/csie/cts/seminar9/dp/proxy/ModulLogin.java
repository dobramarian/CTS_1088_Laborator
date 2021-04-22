package ro.ase.csie.cts.seminar9.dp.proxy;

public class ModulLogin implements InterfataLogin{

    String ipServer;

    public ModulLogin(String ipServer) {
        this.ipServer = ipServer;
    }

    @Override
    public boolean login(String user, String pass) {
        if(user.equals("admin") && pass.equals("root1234"))
            return true;
        else
            return false;
    }

    @Override
    public boolean verificaStatusServer() {
        return false;
    }
}

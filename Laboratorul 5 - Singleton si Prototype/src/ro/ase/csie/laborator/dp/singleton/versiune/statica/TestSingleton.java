package ro.ase.csie.laborator.dp.singleton.versiune.statica;

public class TestSingleton {

	public static void main(String[] args) {
		
		ConexiuneBD conexiune1 = ConexiuneBD.conexiune;
		ConexiuneBD conexiune2 = ConexiuneBD.conexiune;
		
		if(conexiune1 == conexiune2) {
			System.out.println("Identice");
		}
	}

}

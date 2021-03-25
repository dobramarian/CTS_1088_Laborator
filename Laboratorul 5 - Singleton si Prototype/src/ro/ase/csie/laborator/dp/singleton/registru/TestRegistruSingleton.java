package ro.ase.csie.laborator.dp.singleton.registru;

public class TestRegistruSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConexiuneBD conexiune1 = ConexiuneBD.getConexiune("10.0.0.1", "cts");
		ConexiuneBD conexiune2 = ConexiuneBD.getConexiune("10.0.0.1", "cts");
	
		if(conexiune1 == conexiune2) {
			System.out.println("Identice");
		}
		else
		{
			System.out.println("DIFERITE");
		}
		
	}

}

package ro.ase.csie.laborator.dp.singleton;

public class TestSingleton {
	
	public static void main(String[] args) {
		
		ConexiuneBD conexiune1 = ConexiuneBD.getConexiune();
		ConexiuneBD conexiune2 = ConexiuneBD.getConexiune();
		
		if(conexiune1 == conexiune2) {
			System.out.println("Cele 2 conexiuni sunt identice");
		}
		else
		{
			System.out.println("Cele 2 conexiuni sunt identice");		
		}
	}
}

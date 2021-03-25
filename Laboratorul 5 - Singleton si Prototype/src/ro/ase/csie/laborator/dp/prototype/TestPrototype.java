package ro.ase.csie.laborator.dp.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Caracter3D carcater1 = new Caracter3D("model1.3d");
		//Caracter3D carcater2 = new Caracter3D("model1.3d");
		//Caracter3D carcater3 = new Caracter3D("model1.3d");
		
		Caracter3D carcater2 = (Caracter3D) carcater1.clone();
		Caracter3D carcater3 = (Caracter3D) carcater1.clone();

		System.out.println("Sfarsit");
	}

}

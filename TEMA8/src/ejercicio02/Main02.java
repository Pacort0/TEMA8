package ejercicio02;

public class Main02 {

	public static void main(String[] args) {
		Empleado E1 = new Empleado("Pedro");
		Operario O1 = new Operario("Pepa");
		Directivo D1 = new Directivo("Juan");
		Oficial OF1 = new Oficial("Alberto");
		Tecnico T1 = new Tecnico("María");
		
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(O1);
		System.out.println(OF1);
		System.out.println(T1);
	}

}

package ejercicio02;

/**
 * Clase main de los empleados
 * 
 * @author Admin
 *
 */
public class Main02 {

	public static void main(String[] args) {
		// Creamos varios objetos, uno por cada tipo de empleado
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

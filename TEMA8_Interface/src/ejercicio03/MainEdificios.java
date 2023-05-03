package ejercicio03;

public class MainEdificios {

	public static void main(String[] args) {
		//Creamos arrays con tres objetos de cada tipo
		Polideportivo[] polidepors = new Polideportivo[3];
		EdificioOficinas[] oficinas = new EdificioOficinas[3];
		
		//Creamos objetos para cada una de las posiciones de ambos arrays
		polidepors[0] = new Polideportivo("Antonio Puerta", 250);
		polidepors[1] = new Polideportivo("Mendigorría", 100);
		polidepors[2] = new Polideportivo("Maracanation", 1200);
		
		oficinas[0] = new EdificioOficinas(40);
		oficinas[1] = new EdificioOficinas(50);
		oficinas[2] = new EdificioOficinas(20);
		
		//Recorremos el array de oficinas e imprimimos sus datos
		for(EdificioOficinas o : oficinas) {
			System.out.print(o.getSuperficieEdificio() + " | ");
			System.out.println(o.getNumOficinas());
		}
		
		//Espacio
		System.out.println();
		
		//Recorremos el array de polideportivos e imprimimos sus datos
		for(Polideportivo p : polidepors) {
			System.out.print(p.getSuperficieEdificio() + " | ");
			System.out.print(p.getNombre() + " | ");
			System.out.println(p.getTipoInstalacion());
		}
	}

}

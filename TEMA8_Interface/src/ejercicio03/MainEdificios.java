package ejercicio03;

public class MainEdificios {

	public static void main(String[] args) {
		Polideportivo[] polidepors = new Polideportivo[3];
		EdificioOficinas[] oficinas = new EdificioOficinas[3];
		
		polidepors[0] = new Polideportivo("Antonio Puerta", 250);
		polidepors[1] = new Polideportivo("Mendigorría", 100);
		polidepors[2] = new Polideportivo("Maracanation", 1200);
		
		oficinas[0] = new EdificioOficinas(40, 80);
		oficinas[1] = new EdificioOficinas(50, 110);
		oficinas[2] = new EdificioOficinas(20, 30);
		
		for(EdificioOficinas o : oficinas) {
			System.out.print(o.getSuperficieEdificio() + " | ");
			System.out.println(o.getNumOficinas());
		}
		
		System.out.println();
		
		for(Polideportivo p : polidepors) {
			System.out.print(p.getSuperficieEdificio() + " | ");
			System.out.print(p.getNombre() + " | ");
			System.out.println(p.getTipoInstalacion());
		}
	}

}

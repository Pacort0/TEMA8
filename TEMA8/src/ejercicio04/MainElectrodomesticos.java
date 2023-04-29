package ejercicio04;

public class MainElectrodomesticos {

	public static void main(String[] args) {
		double totalLavadoras = 0;
		double totalTelevisiones = 0;
		double totalElestrodomesticos = 0;
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		
		electrodomesticos[0] = new Television(25, 350, "E", "negro", 45, true);
		electrodomesticos[1] = new Television(15, 100);
		electrodomesticos[2] = new Television();
		electrodomesticos[3] = new Lavadora(40, 300, "B", "blanco", 25);
		electrodomesticos[4] = new Lavadora(55, 415);
		electrodomesticos[5] = new Lavadora();
		electrodomesticos[6] = new Electrodomestico(30, 150, "A", "rojo");
		electrodomesticos[7] = new Electrodomestico(45, 275);
		electrodomesticos[8] = new Electrodomestico();
		electrodomesticos[9] = new Television(20, 400, "C", "negro", 60, false);
		
		for(Electrodomestico e : electrodomesticos) {
			System.out.print("Precio final --> " + e.precioFinal());
			System.out.println(" | Precio base --> " + e.precioBase);
			
			totalElestrodomesticos += e.precioFinal();
			
			if(e instanceof Lavadora) {
				totalLavadoras += e.precioFinal();
			}
			else {
				totalTelevisiones += e.precioFinal();
			}
		}
		
		System.out.println();
		System.out.println("El precio final de todas las lavadoras es de " + totalLavadoras + " euros.");
		System.out.println("El precio final de todas las televisiones es de " + totalTelevisiones + " euros.");
		System.out.println("El precio final de todos los electrodomésticos es de " + totalElestrodomesticos + " euros.");
		
	}

}

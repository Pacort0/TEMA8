package ejercicio02;

import java.util.Arrays;

public class MainFutbolista {

	public static void main(String[] args) {
		//Creamos un array de 5 objetos Futbolista
		Futbolista[] furbo = new Futbolista[5];
		
		//Creamos un objeto Futbolista con sus atributos para cada posición del array
		furbo[0] = new Futbolista(9, "Luis Suárez", 36, 477);
		furbo[1] = new Futbolista(9, "Erling Haaland", 22, 206);
		furbo[2] = new Futbolista(10, "Messi", 36, 805);
		furbo[3] = new Futbolista(7, "Cristiano Ronaldo", 38, 830);
		furbo[4] = new Futbolista(7, "Mbappe", 24, 267);

		/**
		 * Recorremos el array imprimiendo los datos de cada objeto
		 */
		for (Futbolista pedri : furbo) {
			System.out.println(pedri.toString());
		}
		System.out.println();
		System.out.println("ARRAY ORDENADO POR CAMISETA \n");
		
		//Ordenamos el array (se ordena por el atributo que le indicamos en el método compareTo)
		Arrays.sort(furbo);
		
		//Recorremos el array e imprimimos sus datos de nuevo
		for (Futbolista pedri : furbo) {
			System.out.println(pedri.toString());
		}
	}

}
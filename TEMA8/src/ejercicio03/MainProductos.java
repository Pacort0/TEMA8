package ejercicio03;

public class MainProductos {

	public static void main(String[] args) {
		// Nos creamos un producto
		Productos p = new Productos("Plátano", 0.4);

		// Imprimimos resultados.
		System.out.println(p.toString());
		System.out.println(p.calcular(3));

		// Nos creamos un perecedero.
		Productos p1 = new Perecederos("Plátano", 0.4, 2);

		// Imprimimos resultados.
		System.out.println(p1.toString());
		System.out.println(p1.calcular(10));

		// Creamos un no perecedero.
		Productos p2 = new NoPerecederos("Sal 1kg", 2, "Comestible");

		// Imprimimos resultados.
		System.out.println(p2.toString());
		System.out.println(p2.calcular(4));

		// Creamos un array de tres productos.
		Productos[] tienda = new Productos[6];

		// Inicializamos el array.
		tienda[0] = new Productos("Peine", 2.5);
		tienda[1] = new Productos("Ordenador", 160);
		tienda[2] = new Perecederos("Tomate", 1.25, 3);
		tienda[3] = new Perecederos("Galletas", 1.75, 4);
		tienda[4] = new NoPerecederos("Miel", 4.5, "Comestible");
		tienda[5] = new NoPerecederos("Canicas", 7, "Juguete");

		

		for (int i = 0; i < tienda.length; i++) {
			System.out.print(tienda[i].toString() + " | Venta de 5 productos: ");
			System.out.println(tienda[i].calcular(5));
		}

	}

}

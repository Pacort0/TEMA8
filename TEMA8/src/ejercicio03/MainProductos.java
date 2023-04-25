package ejercicio03;

import java.util.Arrays;
import java.util.Scanner;

public class MainProductos {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;
		int posicion = 0;
		Productos[] producto = new Productos[0];

		do {
			menu();
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				muestraProductos(producto);
				break;
			case 2:
				crearProd(producto, posicion);
				posicion++;
				break;
			default:
				System.err.println("Esa opción no está contemplada.");
			}
		} while (opcion != 3);

	}

	public static void menu() {
		System.out.println("Introduzca una opción: " + "\n1. Mostrar productos." + "\n2. Crear un nuevo producto."
				+ "\n3. Salir.");
	}

	public static void muestraProductos(Productos[] producto) {
		for (Productos productos : producto) {
			System.out.println(productos.toString());
		}
	}

	public static Productos[] crearProd(Productos[] producto, int contador) {
		
		producto = Arrays.copyOf(producto, producto.length + 1);
		System.out.println(producto.length);

		sc.nextLine();
		
		System.out.println("Introduzca el nombre del producto: ");
		producto[contador].setNombre(sc.nextLine());
		System.out.println("Introduzca el precio del producto: ");
		producto[contador].setPrecio(sc.nextDouble());

		return producto;
	}

	public static int elijeTipo() {
		int eleccion;

		do {
			System.out.println("Elija un tipo de producto: " + "\n1. Perecedero." + "\n2. No perecedero.");
			eleccion = sc.nextInt();
		} while (eleccion != 1 && eleccion != 2);

		return eleccion;
	}

}

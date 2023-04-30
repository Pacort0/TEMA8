package ejercicio05;

import java.util.Arrays;
import java.util.Scanner;

public class MainPoligonos {

	static Scanner sc = new Scanner(System.in);
	static Poligono[] listaPoligs = new Poligono[0];

	public static void main(String[] args) {
		int opcion;

		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				novoTriangulo();
				break;
			case 2:
				novoRectangulo();
				break;
			case 3:
				mostrarDatos();
				break;
			case 4:
				System.out.println("HASTA LUEGOOOO");
				break;
			default:
				System.err.println("Esa opción no está contemplada.");
			}
		} while (opcion != 4);
	}

	private static int menu() {

		System.out.println("Introduzca una opción: " + "\n1. Introducir un triángulo."
				+ "\n2. Introducir un rectángulo." + "\n3. Mostrar datos de los polígonos creados." + "\n4. Salir.");
		int opcion = sc.nextInt();

		return opcion;
	}
	
	private static void novoTriangulo() {
		int numLados = 3;
		double lado1, lado2, lado3;
		listaPoligs = Arrays.copyOf(listaPoligs, listaPoligs.length+1);
		
		System.out.println("Introduzca la longitud del primer lado: ");
		lado1 = sc.nextDouble();
		System.out.println("Introduzca la longitud del segundo lado: ");
		lado2 = sc.nextDouble();
		System.out.println("Introduzca la longitud del tercer lado: ");
		lado3 = sc.nextDouble();
		
		listaPoligs[listaPoligs.length-1] = new Triangulo(numLados, lado1, lado2, lado3);
		
	}
	
	private static void novoRectangulo() {
		int numLados = 4;
		double base, altura;
		listaPoligs = Arrays.copyOf(listaPoligs, listaPoligs.length+1);
		System.out.println("Introduzca la longitud de la base: ");
		base = sc.nextDouble();
		System.out.println("Introduzca la longitud de la altura: ");
		altura = sc.nextDouble();
		
		listaPoligs[listaPoligs.length-1] = new Rectangulo(numLados, base, altura);
	}
	
	private static void mostrarDatos() {
		for(Poligono p : listaPoligs){
			System.out.println(p.toString() + " | El área del poligono es: " + p.area());
		}
	}

}

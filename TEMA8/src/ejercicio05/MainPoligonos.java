package ejercicio05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase ejecutable de 'Poligono' y sus clases hijas
 * @author Admin
 *
 */
public class MainPoligonos {

	// Escáner estático de la clase
	static Scanner sc = new Scanner(System.in);
	//Array estático de polígonos
	static Poligono[] listaPoligs = new Poligono[0];

	public static void main(String[] args) {
		//Variable para guardar la opción introducida por el usuario
		int opcion;
		
		//Mientras la opción no sea '4', se seguirá mostrando el menú
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				novoTriangulo(); //Creamos un triángulo
				break;
			case 2:
				novoRectangulo(); //Creamos un rectángulo
				break;
			case 3:
				mostrarDatos(); //Mostramos los datos de los objetos del array
				break;
			case 4:
				System.out.println("HASTA LUEGOOOO"); //Cerramos el programa
				break;
			default:
				System.err.println("Esa opción no está contemplada."); //Mensaje de error
			}
		} while (opcion != 4);
	}

	/**
	 * Función que imprime el menú y guarda la opción del usuario
	 * @return Devuelve la elección del usuario
	 */
	private static int menu() {

		System.out.println("Introduzca una opción: " + "\n1. Introducir un triángulo."
				+ "\n2. Introducir un rectángulo." + "\n3. Mostrar datos de los polígonos creados." + "\n4. Salir.");
		int opcion = sc.nextInt();

		return opcion;
	}
	
	/**
	 * Función para crear un triángulo
	 */
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
	
	/**
	 * Función para crear un rectángulo
	 */
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
	
	/**
	 * Función que recorre el array y muestra los datos de los objetos del mismo
	 */
	private static void mostrarDatos() {
		for(Poligono p : listaPoligs){
			System.out.println(p.toString() + " | El área del poligono es: " + p.area());
		}
	}

}

package ejercicio01;

import java.util.Arrays;

/**
 * Clase main para probar los métodos de los objetos
 * 
 * @author frodriguez
 *
 */
public class MainSocio {

	public static void main(String[] args) {
		// Guarda el resultado de la primera comparación de prueba
		int res = 0;

		// Creamos dos objetos de prueba iniciales
		Socio s1 = new Socio(1, "Pepe Viyuela", 19);
		Socio s2 = new Socio(2, "Youssef En-Nessyri", 28);

		// Comparamos ambos objetos para asegurarnos de que el código está bien
		// implementado
		res = s1.compareTo(s2);
		System.out.println(res);

		// Creamos un array de 5 objetos 'Socio'
		Socio[] lista = new Socio[5];
		lista[0] = new Socio(5, "Fran Perea", 40);
		lista[1] = new Socio(2, "Alejandro Sanz", 53);
		lista[2] = new Socio(1, "Pablo Alborán", 48);
		lista[3] = new Socio(4, "Joaquín Sardina", 64);
		lista[4] = new Socio(3, "C Tangana", 32);

		// Mostramos la lista de socios sin ordenar
		for (Socio s : lista) {
			System.out.println(s.toString());
		}

		// Espacio
		System.out.println();

		// Ordenamos la lista (se va a ordenar según el parámetro que le indiquemos en
		// el compareTo)
		Arrays.sort(lista);

		System.out.println("ARRAY ORDENADO: \n");

		// Mostramos el array ordenado
		for (Socio s : lista) {
			System.out.println(s.toString());
		}
	}

}
package ejercicio01;

import java.util.Scanner;

/**
 * Clase main para ejecutar las clases de 'hora' y 'horaexacta'
 * 
 * @author Admin
 *
 */
public class Main01 {

	public static void main(String[] args) {
		/**
		 * Variable 'minutos' que guardará los minutos, inicialmente vale 0
		 */
		int minutos = 0;
		/**
		 * Variable 'hora' que guardará las horas, inicialmente vale 0
		 */
		int hora = 0;
		/**
		 * Variable 'segundos' que guardará los segundos, inicialmente vale 0
		 */
		int segundos = 0;
		/**
		 * Contador que se usa para determinar si los datos introducidos por el usuario
		 * son incorrectos o no, y mandar el consecuente mensaje de error
		 */
		int contador = 0;

		// Escáner del programa
		Scanner sc = new Scanner(System.in);

		// Objeto de tipo 'Hora'
		Hora unaHora = new Hora(hora, minutos);

		// Mientras las funciones booleanas de la clase 'Hora' indiquen que los datos
		// introducidos son incorrectos, se piden los datos y se muestra un mensaje de
		// error
		do {
			if (contador > 0) {
				System.err.println("Introduzca valores correctos.");
			}
			System.out.println("Introduzca la hora inicial: ");
			hora = sc.nextInt();
			System.out.println("Introduzca los minutos iniciales: ");
			minutos = sc.nextInt();
			contador++;
		} while (!unaHora.setMinutos(minutos) || !unaHora.setHoras(hora));

		// Se muestra la hora
		System.out.println("La hora inicial es --> " + unaHora.toString());

		// Incrementamos la hora en un minuto
		unaHora.inc();

		// Mostramos la hora incrementada
		System.out.println("La hora aumentada en un minuto es --> " + unaHora.toString());

		// Reseteamos el contador
		contador = 0;

		// Creamos un objeto de tipo 'HoraExacta'
		HoraExacta unaHoraMejor = new HoraExacta(hora, minutos, segundos);

		// Mientras los segundos estén mal introducidos, se mostrará un mensaje de error
		// y se pedirán de nuevo los datos
		do {
			if (contador > 0) {
				System.err.println("Introduzca valores correctos.");
			}
			System.out.println("Ahora introduzca los segundos iniciales: ");
			segundos = sc.nextInt();
			contador++;
		} while (!unaHoraMejor.setSegundos(segundos));
		
		//Mostramos la hora antes de incrementarla
		System.out.println("La hora inicial es --> " + unaHoraMejor.toString());
		
		//Incrementamos la hora en un segundo
		unaHoraMejor.inc();
		
		//Mostramos la hora incrementada en un segundo
		System.out.println("La hora aumentada en un segundo es --> " + unaHoraMejor.toString());

		sc.close();
	}

}

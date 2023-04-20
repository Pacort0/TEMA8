package ejercicio01;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		int minutos = 0;
		int hora = 0;
		int segundos = 0;
		int contador = 0;

		Scanner sc = new Scanner(System.in);

		Hora unaHora = new Hora(hora, minutos);

		do {
			if(contador > 0) {
				System.err.println("Introduzca valores correctos.");
			}
			System.out.println("Introduzca la hora inicial: ");
			hora = sc.nextInt();
			System.out.println("Introduzca los minutos iniciales: ");
			minutos = sc.nextInt();
			contador++;
		} while (!unaHora.setMinutos(minutos) || !unaHora.setHoras(hora));

		System.out.println("La hora inicial es --> " + unaHora.toString());

		unaHora.inc();

		System.out.println("La hora aumentada en un minuto es --> " + unaHora.toString());
		
		contador = 0;
		
		HoraExacta unaHoraMejor = new HoraExacta(hora, minutos, segundos);
		
		do {
			System.out.println("Ahora introduzca los segundos iniciales: ");
			segundos = sc.nextInt();
		}while(!unaHoraMejor.setSegundos(segundos));
		
		System.out.println("La hora inicial es --> " + unaHoraMejor.toString());
		unaHoraMejor.inc();
		System.out.println("La hora aumentada en un minuto es --> " + unaHoraMejor.toString());
		
		sc.close();
	}

}

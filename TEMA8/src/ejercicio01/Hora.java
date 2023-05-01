package ejercicio01;

/**
 * Clase Hora, en ella se definen de manera general los elementos y el
 * funcionamiento de una hora
 * 
 * @author Admin
 *
 */
public class Hora {
	/**
	 * Atributo privado que representa las horas, por defecto vale 0
	 */
	private int horas = 0;
	/**
	 * Atributo privado que representa los minutos, por defecto vale 0
	 */
	private int minutos = 0;

	/**
	 * Constructor de Hora
	 * 
	 * @param horas   Recibe por parámetros las horas a asignar al atributo
	 * @param minutos Recibe por parámetros los minutos a asignar al atributo
	 */
	public Hora(int horas, int minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}

	/**
	 * Método que incrementa la hora actual en un minuto
	 */
	public void inc() {
		if (minutos == 59) { // Si los minutos introducidos = 59, aumenta la hora en 1 y pone los minutos a 0
			horas++;
			if (horas == 24) { // Si una vez aumentada, la hora = 24, la cambia a 0
				horas = 0;
			}
			minutos = 0;
		} else { // Si es cualquier otro minuto, los aumenta en 1
			minutos++;
		}
	}

	/**
	 * Método booleano que informa al programa si son correctos los minutos
	 * introducidos por consola
	 * 
	 * @param valor Recibe por parámetros el valor de los minutos introducidos por
	 *              consola
	 * @return Devuelve un booleano en función de si los minutos son correctos o no
	 */
	public boolean setMinutos(int valor) {
		boolean procede = false;

		if (valor >= 0 && valor <= 59) {
			minutos = valor;
			procede = true;
		}

		return procede;
	}

	/**
	 * Método booleano que informa al programa si son correctas las horas
	 * introducidas por consola
	 * 
	 * @param valor Recibe por parámetros el valor de las horas introducidas por
	 *              consola
	 * @return Devuelve un booleano en función de si las horas son correctas o no
	 */
	public boolean setHoras(int valor) {
		boolean procede = false;

		if (valor >= 0 && valor <= 23) {
			horas = valor;
			procede = true;
		}

		return procede;
	}

	/**
	 * Método toString que devuelve una cadena mostrando la hora
	 */
	public String toString() {
		return horas + " : " + minutos;
	}

}

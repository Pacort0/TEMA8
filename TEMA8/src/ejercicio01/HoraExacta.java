package ejercicio01;

/**
 * En esta clase se definen de manera más exacta los datos que comprenden una
 * hora concreta Hereda de la clase 'Hora'
 * 
 * @author Admin
 *
 */
public class HoraExacta extends Hora {
	/**
	 * Atributo privado que va a representar los segundos, por defecto vale 0
	 */
	private int segundos = 0;

	/**
	 * Constructor de HoraExacta
	 * 
	 * @param horas    Recibe por parámetros las horas a asignar al atributo
	 * @param minutos  Recibe por parámetros los minutos a asignar al atributo
	 * @param segundos Recibe por parámetros los segundos a asignar al atributo
	 */
	public HoraExacta(int horas, int minutos, int segundos) {
		super(horas, minutos);
		this.segundos = segundos;
	}

	/**
	 * Método que informa al programa si los segundos introducidos por consola son
	 * correctos
	 * 
	 * @param valor Recibe por parámetros el valor de los segundos introducidos
	 * @return Devuelve un booleano en función de si es correcto o no el valor de
	 *         segundos introducido
	 */
	public boolean setSegundos(int valor) {
		boolean procede = false;

		if (valor >= 0 && valor <= 59) {
			segundos = valor;
			procede = true;
		}

		return procede;
	}

	/**
	 * Método heredado de la clase 'Hora' que incrementa, además, la hora en un
	 * segundo Si los segundos son 59, los pone a 0 y llama al método de la clase
	 * padre, si no, los incrementa en 1
	 */
	public void inc() {
		if (segundos == 59) {
			segundos = 0;
			super.inc();
		} else {
			segundos++;
		}
	}

	/**
	 * Método toString heredado de la clase 'Hora' que muestra, además, los segundos
	 */
	public String toString() {
		return super.toString() + " : " + segundos;
	}
}

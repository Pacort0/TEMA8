package ejercicios;

public class HoraExacta extends Hora{
	private int segundos = 0;

	public HoraExacta(int horas, int minutos, int segundos) {
		super(horas, minutos);
		this.segundos = segundos;
	}
	
	public boolean setSegundos(int valor) {
		boolean procede = false;
		
		if(valor >= 0 && valor <= 59) {
			segundos = valor;
			procede = true;
		}
		
		return procede;
	}
	
	public void inc() {
		if(segundos == 59) {
			segundos = 0;
			super.inc();
		}
		else {
			segundos++;
		}
	}
	
	public String toString() {
		return super.toString() + " : " + segundos;
	}
}

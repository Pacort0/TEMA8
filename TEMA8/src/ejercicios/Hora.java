package ejercicios;

public class Hora {
	private int horas;
	private int minutos;

	public Hora(int horas, int minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}

	public void inc() {
		if (minutos == 59) {
			horas++;
			minutos = 0;
		} else {
			minutos++;
		}
	}
	
	public boolean setMinutos() {
		
	}

}

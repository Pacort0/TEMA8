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
	
	public boolean setMinutos(int valor) {
		boolean procede = false;
		
		if(valor >= 0 && valor <= 59) {
			minutos = valor;
			procede = true;
		}
		
		return procede;
	}
	
	public boolean setHoras(int valor) {
		boolean procede = false;
		
		if(valor >= 0 && valor <= 23) {
			horas = valor;
			procede = true;
		}
		
		return procede;
	}
	
	public String toString(){
		return horas + " : " + minutos;
	}

}

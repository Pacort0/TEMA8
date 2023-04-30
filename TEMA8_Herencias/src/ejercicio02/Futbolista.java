package ejercicio02;

public class Futbolista implements Comparable <Object> {
	protected int numCam = 0;
	protected String nombre = "";
	protected int edad = 18;
	protected int numGoles = 0;

	public Futbolista(int numCam, String nombre, int edad, int numGoles) {
		if (numCam > 0 && numCam < 100) {
			this.numCam = numCam;
		}
		this.nombre = nombre;
		if (edad >= 18) {
			this.edad = edad;
		}
		if (numGoles > 0) {
			this.numGoles = numGoles;
		}
	}

	@Override
	public String toString() {
		return "Número de camiseta: " + numCam + ", nombre: " + nombre + ", edad: " + edad + ", numGoles: " + numGoles;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		
		Futbolista neymar = (Futbolista) obj;
		if (this.numCam == neymar.numCam && this.nombre.equalsIgnoreCase(neymar.nombre))
			iguales = true;
		
		return iguales;
	}

	@Override
	public int compareTo(Object o) {
		int res = 0;
		Futbolista messi = (Futbolista) o;
		
		if(this.numCam > messi.numCam) {
			res = 1;
		} else if (this.numCam < messi.numCam) {
			res = -1;
		} else {
			if(this.nombre.compareToIgnoreCase(messi.nombre) > 0) {
				res = 1;
			} else {
				res = -1;
			}
		}
		
		return res;
	}
	
}

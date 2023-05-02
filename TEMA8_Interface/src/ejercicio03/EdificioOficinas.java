package ejercicio03;

public class EdificioOficinas implements edificio {

	protected int numOficinas = 0;
	protected double superficie = 0;

	public EdificioOficinas(int numOficinas, double superficie) {
		super();
		this.numOficinas = numOficinas;
		this.superficie = superficie;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

	public int getNumOficinas() {
		return numOficinas;
	}

}

package ejercicio03;

interface instalacion{
	int getTipoInstalacion();
}

public class Polideportivo implements instalacion {
	protected String nombre;
	protected double superficie;
	
	@Override
	public int getTipoInstalacion() {
		
		return 0;
	}

}
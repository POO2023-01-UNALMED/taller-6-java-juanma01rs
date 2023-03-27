package vehiculos;

public class Camioneta extends Vehículo {
	
	private boolean volco;
	public static int cantidadCamionetas;
	
	public Camioneta (String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, boolean volco) {
		
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		Camioneta.cantidadCamionetas++;
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public boolean isVolco() {
		return this.volco;
	}

}

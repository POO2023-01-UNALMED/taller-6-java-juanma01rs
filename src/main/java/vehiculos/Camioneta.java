package vehiculos;

public class Camioneta extends Vehículo {
	
	private boolean volco;
	public static int cantidadCamionetas;
	
	public Camioneta (String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		cantidadCamionetas++;
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public boolean isVolco() {
		return this.volco;
	}

	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}
}

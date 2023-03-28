package vehiculos;

public class Automóvil extends Vehículo {
	
	private int puestos;
	private static int cantidadAutomoviles;
	
	public Automóvil (String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
	
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		Automóvil.cantidadAutomoviles++;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public int getPuestos() {
		return this.puestos;
	}
	
	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}

}

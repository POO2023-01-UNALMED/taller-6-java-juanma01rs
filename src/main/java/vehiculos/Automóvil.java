package vehiculos;

public class Automovil extends Vehículo {
	
	private int puestos;
	private static int CantidadAutomoviles;
	
	public Automovil (String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
	
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		Automovil.CantidadAutomoviles++;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public int getPuestos() {
		return puestos;
	}
	
	public static int getCantidadAutomoviles() {
		return CantidadAutomoviles;
	}

}

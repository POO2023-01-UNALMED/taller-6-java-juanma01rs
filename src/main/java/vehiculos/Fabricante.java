package vehiculos;

public class Fabricante {

	private String nombre;
	private País pais;
	
	public Fabricante(String nombre, País pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public static void fabricaMayorVentas() {
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setPais(País pais) {
		this.pais = pais;
	}
	
	public País getPais() {
		return this.pais;
	}
}


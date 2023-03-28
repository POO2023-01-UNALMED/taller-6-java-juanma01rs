package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	public int ventas;
	private static ArrayList<Pais> listaPaises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		listaPaises.add(this);
	}
	
	public static Pais paisMasVendedor() {
		Pais masVendedor = listaPaises.get(0);
		
		for (Pais recorridoP: listaPaises) {
			if (recorridoP.ventas > masVendedor.ventas) {
				masVendedor = recorridoP;
			}
		}
		return masVendedor;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
}


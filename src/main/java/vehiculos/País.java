package vehiculos;

import java.util.ArrayList;

public class País {
	
	private String nombre;
	private int ventasPais;
	private static ArrayList<País> listaPaises = new ArrayList<País>();
	
	public País(String nombre) {
		this.nombre = nombre;
		listaPaises.add(this);
	}
	
	public static void paisMasVendedor() {
		País masVendedor = listaPaises.get(0);
		
		for (País recorridoP: listaPaises) {
			if (recorridoP.ventasPais > masVendedor.ventasPais) {
				masVendedor = recorridoP;
			}
		}
		return masVendedor;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}


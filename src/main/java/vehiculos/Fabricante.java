package vehiculos;

import java.util.ArrayList;

public class Fabricante {

	private String nombre;
	private Pais pais;
	public int ventas;
	private static ArrayList<Fabricante> listaFabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		pais.ventas++;
		listaFabricantes.add(this);
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante mayorVentas = listaFabricantes.get(0);
		
		for (Fabricante recorridoF: listaFabricantes) {
			if (recorridoF.ventas > mayorVentas.ventas) {
				mayorVentas = recorridoF;
			}
		}
		return mayorVentas;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Pais getPais() {
		return pais;
	}
}


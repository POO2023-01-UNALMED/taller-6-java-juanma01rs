package vehiculos;

import java.util.ArrayList;

public class Fabricante {

	private String nombre;
	private País pais;
	private int ventasFabricante;
	private static ArrayList<Fabricante> listaFabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, País pais) {
		this.nombre = nombre;
		this.pais = pais;
		pais.ventasPais++;
		listaFabricantes.add(this);
	}
	
	public static void fabricaMayorVentas() {
		Fabricante mayorVentas = listaFabricantes.get(0);
		
		for (Fabricante recorridoF: listaFabricantes) {
			if (recorridoF.ventasFabricante > mayorVentas.ventasFabricante) {
				mayorVentas = recorridoF;
			}
		}
		return mayorVentas;
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


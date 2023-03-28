package vehiculos;

import java.util.ArrayList;

public class Vehículo {
	
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;

	public Vehículo (String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehículo.CantidadVehiculos++;
		fabricante.ventasFabricante++;
	}
	
	public static String vehiculosPorTipo() {
		return ("Automoviles: " + (Automóvil.getCantidadAutomoviles()) + "\n" + "Camionetas: " + (Camion.getCantidadCamiones) + "\n" + "Camiones: " + (Camioneta.getCantidadCamionetas));
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}	
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
}

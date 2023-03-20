package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas; 
	
	public Zoologico() {}
	
	
	public void agregarZonas(Zona zona) {	
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int counter = 0;
		for (Zona z : zonas) {
			counter += z.cantidadAnimales();
		}
		
		return counter;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}	
}

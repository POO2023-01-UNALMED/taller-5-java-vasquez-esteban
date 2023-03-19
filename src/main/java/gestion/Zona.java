package gestion;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo[];
	private Animal animales[];
	
	public Zona() {}
	
	public Zona(String nombre) {
		this.setNombre(nombre);
	}
	
	public Zona(String nombre, Zoologico zoo[]) {
		this.setNombre(nombre);
		this.setZoo(zoo);
	}
	
	public Zona(String nombre, Zoologico zoo[], Animal animales[]) {
		this.setNombre(nombre);
		this.setZoo(zoo);
		this.setAnimales(animales);
	}
	
	public void agregarAnimales() {
		
	}
	
	public void cantidadAnimales() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico[] getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo[]) {
		this.zoo = zoo;
	}

	public Animal[] getAnimales() {
		return animales;
	}

	public void setAnimales(Animal animales[]) {
		this.animales = animales;
	}
}

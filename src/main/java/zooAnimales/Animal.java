package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona[];
	
	public Animal() {
		totalAnimales++;
	}
	
	public Animal(String nombre) {
		totalAnimales++;
		this.setNombre(nombre);
	}
	
	public Animal(String nombre, 
			int edad) {
		totalAnimales++;
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	public Animal(String nombre, 
			int edad, String habitat) {
		totalAnimales++;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
	}
	
	public Animal(String nombre, 
			int edad, String habitat, String genero) {
		totalAnimales++;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
	}
	
	public Animal(String nombre, 
			int edad, String habitat, String genero, Zona zona[]) {
		totalAnimales++;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
	}
	
	public void movimiento() {
		
	}

	public void totalPorTipo() {
		
	}
	
	public String toString() {
		return "";
	}

	public int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona[] getZona() {
		return zona;
	}

	public void setZona(Zona zona[]) {
		this.zona = zona;
	}
}

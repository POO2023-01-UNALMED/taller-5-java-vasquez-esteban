package zooAnimales;

import gestion.Zona;

public class Animal {
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	
	private Zona zona;
	private static int totalAnimales;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		
		totalAnimales++;
	}
	
	public Animal() {
		this("", 0, "", "");
	}
	
	public String movimiento() {
		return "desplazarse";
	}

	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos()
				+ "\nAves: " + Ave.cantidadAves()
				+ "\nReptiles: " + Reptil.cantidadReptiles()
				+ "\nPeces: " + Pez.cantidadPeces()
				+ "\nAnfibios: " + Anfibio.cantidadAnfibios()
				;
	}
	
	public String toString() {
		String z = "Mi nombre es " + this.nombre 
				+ ", tengo una edad de " + this.getEdad()
				+ ", habito en " + this.getHabitat()
				+ " y mi genero es " + this.getGenero();

				if (this.getZona() != null) {
					 z += ", la zona en la que me ubico es " + this.getZona() + ", en el " + this.getZona().getZoo();
					}
		return z;
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

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
}

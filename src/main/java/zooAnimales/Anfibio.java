package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
	private Anfibio listado[];
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {}
	
	public Anfibio(
			Anfibio listado[]) {
			
			this.setListado(listado);
		}
	
	public Anfibio(
			Anfibio listado[], int ranas) {
			
			this.setListado(listado);
			this.ranas = ranas;
		}
	
	public Anfibio(
			Anfibio listado[], int ranas, int salamandras) {
			
			this.setListado(listado);
			this.ranas = ranas;
			this.salamandras = salamandras;
		}
	
	public Anfibio(
			Anfibio listado[], int ranas, int salamandras,
			String colorPiel) {
			
			this.setListado(listado);
			this.ranas = ranas;
			this.salamandras = salamandras;
			this.setColorPiel(colorPiel);
		}
	
	public Anfibio(
			Anfibio listado[], int ranas, int salamandras,
			String colorPiel, boolean venenoso) {
			
			this.setListado(listado);
			this.ranas = ranas;
			this.salamandras = salamandras;
			this.setColorPiel(colorPiel);
			this.setVenenoso(venenoso);
		}
	
	public Anfibio(
			Anfibio listado[], int ranas, int salamandras,
			String colorPiel, boolean venenoso,
			int totalAnimales) {
			
			this.setListado(listado);
			this.ranas = ranas;
			this.salamandras = salamandras;
			this.setColorPiel(colorPiel);
			this.setVenenoso(venenoso);
			
			this.setTotalAnimales(totalAnimales);
		}
	
	public Anfibio(
			Anfibio listado[], int ranas, int salamandras,
			String colorPiel, boolean venenoso,
			int totalAnimales, String nombre) {
			
			this.setListado(listado);
			this.ranas = ranas;
			this.salamandras = salamandras;
			this.setColorPiel(colorPiel);
			this.setVenenoso(venenoso);
			
			this.setTotalAnimales(totalAnimales);
			this.setNombre(nombre);
		}
	
	public Anfibio(
			Anfibio listado[], int ranas, int salamandras,
			String colorPiel, boolean venenoso,
			int totalAnimales, String nombre, int edad) {
			
			this.setListado(listado);
			this.ranas = ranas;
			this.salamandras = salamandras;
			this.setColorPiel(colorPiel);
			this.setVenenoso(venenoso);
			
			this.setTotalAnimales(totalAnimales);
			this.setNombre(nombre);
			this.setEdad(edad);
		}
	
	public Anfibio(
			Anfibio listado[], int ranas, int salamandras,
			String colorPiel, boolean venenoso,
			int totalAnimales, String nombre, int edad, 
			String habitat) {
			
			this.setListado(listado);
			this.ranas = ranas;
			this.salamandras = salamandras;
			this.setColorPiel(colorPiel);
			this.setVenenoso(venenoso);
			
			this.setTotalAnimales(totalAnimales);
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
		}
	
	public Anfibio(
			Anfibio listado[], int ranas, int salamandras,
			String colorPiel, boolean venenoso,
			int totalAnimales, String nombre, int edad, 
			String habitat, String genero) {
			
			this.setListado(listado);
			this.ranas = ranas;
			this.salamandras = salamandras;
			this.setColorPiel(colorPiel);
			this.setVenenoso(venenoso);
			
			this.setTotalAnimales(totalAnimales);
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
		}
	
	public Anfibio(
		Anfibio listado[], int ranas, int salamandras,
		String colorPiel, boolean venenoso,
		int totalAnimales, String nombre, int edad, 
		String habitat, String genero, Zona zona[]) {
		
		this.setListado(listado);
		this.ranas = ranas;
		this.salamandras = salamandras;
		this.setColorPiel(colorPiel);
		this.setVenenoso(venenoso);
		
		this.setTotalAnimales(totalAnimales);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
	}
	
	
	public void cantidadAnfibios() {
		
	}
	
	@Override
	public void movimiento() {
		
	}
	
	public void crearRana() {
		
	}
	
	public void crearSalamandra() {
		
	}


	public Anfibio[] getListado() {
		return listado;
	}


	public void setListado(Anfibio listado[]) {
		this.listado = listado;
	}


	public String getColorPiel() {
		return colorPiel;
	}


	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}


	public boolean isVenenoso() {
		return venenoso;
	}


	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}

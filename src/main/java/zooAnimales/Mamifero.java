package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {
	private Mamifero listado[];
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {}
	
	public Mamifero(
			Mamifero listado[]) {
			
			this.setListado(listado);
		}
	
	public Mamifero(
			Mamifero listado[], int caballos) {
			
			this.setListado(listado);
			this.caballos = caballos;
		}
	
	public Mamifero(
			Mamifero listado[], int caballos, int leones) {
			
			this.setListado(listado);
			this.caballos = caballos;
			this.leones = leones;
		}
	
	public Mamifero(
			Mamifero listado[], int caballos, int leones,
			boolean pelaje) {
			
			this.setListado(listado);
			this.caballos = caballos;
			this.leones = leones;
			this.setPelaje(pelaje);
		}
	
	public Mamifero(
			Mamifero listado[], int caballos, int leones,
			boolean pelaje, int patas) {
			
			this.setListado(listado);
			this.caballos = caballos;
			this.leones = leones;
			this.setPelaje(pelaje);
			this.setPatas(patas);
		}
	
	public Mamifero(
			Mamifero listado[], int caballos, int leones,
			boolean pelaje, int patas,
			int totalAnimales) {
			
			this.setListado(listado);
			this.caballos = caballos;
			this.leones = leones;
			this.setPelaje(pelaje);
			this.setPatas(patas);
			
			this.setTotalAnimales(totalAnimales);
		}
	
	public Mamifero(
			Mamifero listado[], int caballos, int leones,
			boolean pelaje, int patas,
			int totalAnimales, String nombre) {
			
			this.setListado(listado);
			this.caballos = caballos;
			this.leones = leones;
			this.setPelaje(pelaje);
			this.setPatas(patas);
			
			this.setTotalAnimales(totalAnimales);
			this.setNombre(nombre);
		}
	
	public Mamifero(
			Mamifero listado[], int caballos, int leones,
			boolean pelaje, int patas,
			int totalAnimales, String nombre, int edad) {
			
			this.setListado(listado);
			this.caballos = caballos;
			this.leones = leones;
			this.setPelaje(pelaje);
			this.setPatas(patas);
			
			this.setTotalAnimales(totalAnimales);
			this.setNombre(nombre);
			this.setEdad(edad);}
	
	public Mamifero(
			Mamifero listado[], int caballos, int leones,
			boolean pelaje, int patas,
			int totalAnimales, String nombre, int edad, 
			String habitat) {
			
			this.setListado(listado);
			this.caballos = caballos;
			this.leones = leones;
			this.setPelaje(pelaje);
			this.setPatas(patas);
			
			this.setTotalAnimales(totalAnimales);
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
		}
	
	public Mamifero(
			Mamifero listado[], int caballos, int leones,
			boolean pelaje, int patas,
			int totalAnimales, String nombre, int edad, 
			String habitat, String genero) {
			
			this.setListado(listado);
			this.caballos = caballos;
			this.leones = leones;
			this.setPelaje(pelaje);
			this.setPatas(patas);
			
			this.setTotalAnimales(totalAnimales);
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
		}
	
	public Mamifero(
		Mamifero listado[], int caballos, int leones,
		boolean pelaje, int patas,
		int totalAnimales, String nombre, int edad, 
		String habitat, String genero, Zona zona[]) {
		
		this.setListado(listado);
		this.caballos = caballos;
		this.leones = leones;
		this.setPelaje(pelaje);
		this.setPatas(patas);
		
		this.setTotalAnimales(totalAnimales);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
	}
	
	public void cantidadMamiferos() {
		
	}
	
	public void crearCaballo() {
		
	}
	
	public void crearLeon() {
		
	}

	public Mamifero[] getListado() {
		return listado;
	}

	public void setListado(Mamifero listado[]) {
		this.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
}

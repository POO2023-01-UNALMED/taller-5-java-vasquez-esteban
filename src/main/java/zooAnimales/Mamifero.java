package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {
	private Mamifero listado[];
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {super();}
	
	public Mamifero(String nombre)
		{
			super();
			this.setNombre(nombre);
			}
	
	public Mamifero(String nombre,
			int edad)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			}
	
	public Mamifero(String nombre,
			int edad, String habitat)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			}
	
	public Mamifero(String nombre,
			int edad, String habitat, String genero)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			}
	
	public Mamifero(String nombre,
			int edad, String habitat, String genero, Zona zona[])
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			}
	
	public Mamifero(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Mamifero listado[])
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			}
	
	public Mamifero(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Mamifero listado[], int caballos)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			this.caballos = caballos;
			}
	
	public Mamifero(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Mamifero listado[], int caballos, int leones)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			this.caballos = caballos;
			this.leones = leones;
			}
	
	public Mamifero(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Mamifero listado[], int caballos, int leones,
			boolean pelaje)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			this.caballos = caballos;
			this.leones = leones;
			this.pelaje = pelaje;
			}
	
	public Mamifero(String nombre,
		int edad, String habitat, String genero, Zona zona[], 
		Mamifero listado[], int caballos, int leones,
		boolean pelaje, int patas)
	{
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		
		this.listado = listado;
		this.caballos = caballos;
		this.leones = leones;
		this.pelaje = pelaje;
		this.patas = patas;
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

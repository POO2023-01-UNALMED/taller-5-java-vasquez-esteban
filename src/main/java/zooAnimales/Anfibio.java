package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
	private Anfibio listado[];
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		super();
	}
	
	public Anfibio(String nombre)
	{
		super();
		this.setNombre(nombre);
		}
	
	public Anfibio(String nombre,
			int edad)
	{
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		}
	
	public Anfibio(String nombre,
			int edad, String habitat)
	{
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		}
	
	public Anfibio(String nombre,
			int edad, String habitat, String genero)
	{
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		}
	
	public Anfibio(String nombre,
			int edad, String habitat, String genero, Zona zona[])
	{
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		}
	
	public Anfibio(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Anfibio listado[])
	{
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		
		this.listado = listado;
		}
	
	public Anfibio(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Anfibio listado[], int ranas)
	{
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		
		this.listado = listado;
		this.ranas = ranas;
		}
	
	public Anfibio(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Anfibio listado[], int ranas, int salamandras,
			String colorPiel)
	{
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		
		this.listado = listado;
		this.ranas = ranas;
		this.salamandras = salamandras;
		this.colorPiel = colorPiel;
		}
	
	public Anfibio(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Anfibio listado[], int ranas, int salamandras,
			String colorPiel, boolean venenoso)
	{
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		
		this.listado = listado;
		this.ranas = ranas;
		this.salamandras = salamandras;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
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

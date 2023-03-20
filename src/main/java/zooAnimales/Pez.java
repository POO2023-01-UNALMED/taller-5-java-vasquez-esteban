package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
	private Pez listado[];
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {super();}
	
	public Pez(String nombre)
		{
			super();
			this.setNombre(nombre);
			}
	
	public Pez(String nombre,
			int edad)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			}
	
	public Pez(String nombre,
			int edad, String habitat)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			}
	
	public Pez(String nombre,
			int edad, String habitat, String genero)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			}
	
	public Pez(String nombre,
			int edad, String habitat, String genero, Zona zona[])
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			}
	
	public Pez(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Pez listado[])
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			}
	
	public Pez(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Pez listado[], int salmones)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			this.salmones = salmones;
			}
	
	public Pez(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Pez listado[], int salmones, int bacalaos)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			this.salmones = salmones;
			this.bacalaos = bacalaos;
			}
	
	public Pez(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Pez listado[], int salmones, int bacalaos, String colorEscamas)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			this.salmones = salmones;
			this.bacalaos = bacalaos;
			this.colorEscamas = colorEscamas;
			}
	
	public Pez(String nombre,
		int edad, String habitat, String genero, Zona zona[], 
		Pez listado[], int salmones, int bacalaos, String colorEscamas, int cantidadAletas)
	{
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		
		this.listado = listado;
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		}
	
	public void cantidadPeces() {
		
	}
	
	@Override
	public void movimiento() {
		
	}
	
	public void crearSalmon() {
		
	}
	
	public void crearBacalao() {
		
	}

	public Pez[] getListado() {
		return listado;
	}

	public void setListado(Pez listado[]) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}

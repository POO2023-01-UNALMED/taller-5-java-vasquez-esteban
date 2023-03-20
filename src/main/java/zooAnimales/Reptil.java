package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {
	private Reptil listado[];
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {super();}
	
	public Reptil(String nombre)
		{
			super();
			this.setNombre(nombre);
			}
	
	public Reptil(String nombre,
			int edad)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			}
	
	public Reptil(String nombre,
			int edad, String habitat)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			}
	
	public Reptil(String nombre,
			int edad, String habitat, String genero)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			}
	
	public Reptil(String nombre,
			int edad, String habitat, String genero, Zona zona[])
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			}
	
	public Reptil(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Reptil listado[])
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			}
	
	public Reptil(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Reptil listado[], int iguanas)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			this.iguanas = iguanas;
			}
	
	public Reptil(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Reptil listado[], int iguanas, int serpientes)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			this.iguanas = iguanas;
			this.serpientes = serpientes;
			}
	
	public Reptil(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Reptil listado[], int iguanas, int serpientes, String colorEscamas)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			this.iguanas = iguanas;
			this.serpientes = serpientes;
			this.colorEscamas = colorEscamas;
			}
	
	public Reptil(String nombre,
		int edad, String habitat, String genero, Zona zona[], 
		Reptil listado[], int iguanas, int serpientes, String colorEscamas, int largoCola)
	{
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		
		this.listado = listado;
		this.iguanas = iguanas;
		this.serpientes = serpientes;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		}
	
	public void cantidadReptiles() {
		
	}
	
	@Override
	public void movimiento() {
		
	}
	
	public void crearIguana() {
		
	}
	
	public void crearSerpiente() {
		
	}

	public Reptil[] getListado() {
		return listado;
	}

	public void setListado(Reptil listado[]) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}

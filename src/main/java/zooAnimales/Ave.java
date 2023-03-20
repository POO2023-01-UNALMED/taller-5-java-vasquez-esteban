package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
	private Ave listado[];
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave() {super();}
	
	public Ave(String nombre)
		{
			super();
			this.setNombre(nombre);
			}
	
	public Ave(String nombre,
			int edad)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			}
	
	public Ave(String nombre,
			int edad, String habitat)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			}
	
	public Ave(String nombre,
			int edad, String habitat, String genero)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);

			}
	
	public Ave(String nombre,
			int edad, String habitat, String genero, Zona zona[])
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
	
			}
	
	public Ave(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Ave listado[])
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			}
	
	public Ave(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Ave listado[], int halcones)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			this.halcones = halcones;
			}
	
	public Ave(String nombre,
			int edad, String habitat, String genero, Zona zona[], 
			Ave listado[], int halcones, int aguilas)
		{
			super();
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			this.setZona(zona);
			
			this.listado = listado;
			this.halcones = halcones;
			this.aguilas = aguilas;
			}
	
	public Ave(String nombre,
		int edad, String habitat, String genero, Zona zona[], 
		Ave listado[], int halcones, int aguilas,
		String colorPlumas)
	{
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		
		this.listado = listado;
		this.halcones = halcones;
		this.aguilas = aguilas;
		this.colorPlumas = colorPlumas;
		}
	
	public void cantidadAves() {
		
	}
	
	@Override
	public void movimiento() {
		
	}
	
	public void crearHalcon() {
		
	}
	
	public void crearAguila() {
		
	}

	public Ave[] getListado() {
		return listado;
	}

	public void setListado(Ave listado[]) {
		this.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}

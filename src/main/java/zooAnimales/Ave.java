package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
	private Ave listado[];
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave() {}
	
	public Ave(
			Ave listado[]) {
			
			this.setListado(listado);
		}
	
	public Ave(
			Ave listado[], int halcones) {
			
			this.setListado(listado);
			this.halcones = halcones;
		}
	
	public Ave(
			Ave listado[], int halcones, int aguilas) {
			
			this.setListado(listado);
			this.halcones = halcones;
			this.aguilas = aguilas;
		}
	
	public Ave(
			Ave listado[], int halcones, int aguilas,
			String colorPlumas) {
			
			this.setListado(listado);
			this.halcones = halcones;
			this.aguilas = aguilas;
			this.setColorPlumas(colorPlumas);
		}
	
	public Ave(
			Ave listado[], int halcones, int aguilas,
			String colorPlumas,
			int totalAnimales) {
			
			this.setListado(listado);
			this.halcones = halcones;
			this.aguilas = aguilas;
			this.setColorPlumas(colorPlumas);
			
			this.setTotalAnimales(totalAnimales);
		}
	
	public Ave(
			Ave listado[], int halcones, int aguilas,
			String colorPlumas,
			int totalAnimales, String nombre) {
			
			this.setListado(listado);
			this.halcones = halcones;
			this.aguilas = aguilas;
			this.setColorPlumas(colorPlumas);
			
			this.setTotalAnimales(totalAnimales);
			this.setNombre(nombre);
		}
	
	public Ave(
			Ave listado[], int halcones, int aguilas,
			String colorPlumas,
			int totalAnimales, String nombre, int edad) {
			
			this.setListado(listado);
			this.halcones = halcones;
			this.aguilas = aguilas;
			this.setColorPlumas(colorPlumas);
			
			this.setTotalAnimales(totalAnimales);
			this.setNombre(nombre);
			this.setEdad(edad);
		}
	
	public Ave(
			Ave listado[], int halcones, int aguilas,
			String colorPlumas,
			int totalAnimales, String nombre, int edad, 
			String habitat) {
			
			this.setListado(listado);
			this.halcones = halcones;
			this.aguilas = aguilas;
			this.setColorPlumas(colorPlumas);
			
			this.setTotalAnimales(totalAnimales);
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
		}
	
	public Ave(
			Ave listado[], int halcones, int aguilas,
			String colorPlumas,
			int totalAnimales, String nombre, int edad, 
			String habitat, String genero) {
			
			this.setListado(listado);
			this.halcones = halcones;
			this.aguilas = aguilas;
			this.setColorPlumas(colorPlumas);
			
			this.setTotalAnimales(totalAnimales);
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
		}
	
	public Ave(
		Ave listado[], int halcones, int aguilas,
		String colorPlumas,
		int totalAnimales, String nombre, int edad, 
		String habitat, String genero, Zona zona[]) {
		
		this.setListado(listado);
		this.halcones = halcones;
		this.aguilas = aguilas;
		this.setColorPlumas(colorPlumas);
		
		this.setTotalAnimales(totalAnimales);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
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

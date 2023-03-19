package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
	private Pez listado[];
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {}
	
	public Pez(
		Pez listado[], int salmones, int bacalaos,
		String colorEscamas, int cantidadAletas,
		int totalAnimales, String nombre, int edad, 
		String habitat, String genero, Zona zona[]) {
		
		this.setListado(listado);
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.setColorEscamas(colorEscamas);
		this.setCantidadAletas(cantidadAletas);
		
		this.setTotalAnimales(totalAnimales);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
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

package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {
	private Reptil listado[];
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {}
	
	public Reptil(
		Reptil listado[], int iguanas, int serpientes,
		String colorEscamas, int largoCola,
		int totalAnimales, String nombre, int edad, 
		String habitat, String genero, Zona zona[]) {
		
		this.setListado(listado);
		this.iguanas = iguanas;
		this.serpientes = serpientes;
		this.setColorEscamas(colorEscamas);
		this.setLargoCola(largoCola);
		
		this.setTotalAnimales(totalAnimales);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
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

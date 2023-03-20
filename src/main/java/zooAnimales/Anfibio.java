package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	
	public int ranas;
	public int salamandras;
	
	private String colorPiel;
	private boolean venenoso;
	
	Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		
		listado.add(this);
		}
	
	public Anfibio() {
		this("", 0, "", "", "", false);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana() {
		
	}
	
	public void crearSalamandra() {
		
	}


	public ArrayList<Anfibio> getListado() {
		return Anfibio.listado;
	}


	public void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
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

package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {this("", 0, "", "", "", 0);}
	
	public Pez(String nombre,
		int edad, String habitat, String genero, String colorEscamas, int cantidadAletas)
	{
		super(nombre, edad, habitat, genero);

		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "nadar";
		}
	
	public void crearSalmon() {
		
	}
	
	public void crearBacalao() {
		
	}

	public ArrayList<Pez> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
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

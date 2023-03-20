package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		this("", 0, "", "", false, 0);
	}
	
	public Mamifero(String nombre,
		int edad, String habitat, String genero, boolean pelaje, int patas)
	{
		super(nombre, edad, habitat, genero);

		this.pelaje = pelaje;
		this.patas = patas;
		}
	
	public static int cantidadMamiferos() {
		return Mamifero.listado.size();
	}
	
	public void crearCaballo() {
		
	}
	
	public void crearLeon() {
		
	}

	public ArrayList<Mamifero> getListado() {
		return Mamifero.listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
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

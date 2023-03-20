package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		this("", 0, "", "", "", 0);
	}
	
	public Reptil(String nombre,
		int edad, String habitat, String genero, String colorEscamas, int largoCola)
		{
			super(nombre, edad, habitat, genero);
			
			this.colorEscamas = colorEscamas;
			this.largoCola = largoCola;
		}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana() {
		
	}
	
	public void crearSerpiente() {
		
	}

	public ArrayList<Reptil> getListado() {
		return Reptil.listado;
	}

	public void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
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

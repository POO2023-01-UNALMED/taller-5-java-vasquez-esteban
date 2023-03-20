package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave() {
		super("", 0, "", "");
		}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);

		this.colorPlumas = colorPlumas;
		listado.add(this);
		}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon() {
		new Ave("", 0, "montanas", "", "cafe glorioso");
		halcones++;
	}
	
	public void crearAguila() {
		new Ave("", 0, "montanas", "", "blanco y amarillo");
		aguilas++;
	}

	public ArrayList<Ave> getListado() {
		return Ave.listado;
	}

	public void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}

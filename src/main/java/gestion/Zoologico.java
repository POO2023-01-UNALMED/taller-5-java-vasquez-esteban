package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Zona zonas[]; 
	
	public Zoologico() {}
	
	public Zoologico(String nombre) {
		this.setNombre(nombre);
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);
	}
	
	public Zoologico(String nombre, String ubicacion, Zona zonas[]) {
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);
		this.setZonas(zonas);
	}
	
	public void agregarZonas() {	
	}
	
	public int cantidadTotalAnimales() {
		return 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Zona[] getZonas() {
		return zonas;
	}

	public void setZonas(Zona zonas[]) {
		this.zonas = zonas;
	}	
}

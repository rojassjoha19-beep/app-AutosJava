package Modelos;

public class Auto {

	private String patente;
	private int velocidad;
	private String nombreAlta; //quien dio de alta el auto
	
	public String getNombreAlta() {
		return nombreAlta;
	}

	public Auto(String patente, int velocidad) {
		super();
		this.patente = patente;
		this.velocidad = velocidad;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
}
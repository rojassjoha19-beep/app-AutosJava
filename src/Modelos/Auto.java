package Modelos;

public class Auto {

	public String patente;
	public int velocidad;
	
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
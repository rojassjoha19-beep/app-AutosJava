package Modelos;
public class Auto {
    
public String Patente;
public double Velocidad ;

public Auto(String Patente, double Velocidad){
    this.Patente = Patente;
    this.Velocidad = Velocidad;
}

public String getPatente() {
    return this.Patente;
}
public double getVelocidad() {
    return this.Velocidad;
}


public void setPatente(String Patente) {
    this.Patente = Patente;
}
public void  setVelocidad(double Velocidad) {
    this.Velocidad = Velocidad;
}
}


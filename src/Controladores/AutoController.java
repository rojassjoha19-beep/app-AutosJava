package Controladores;

import java.util.List;

import Contenedores.ContenedorAutos;
import Interfaces.IController;
import Modelos.Auto;
import validador.ValidadorVelocidad;

public class AutoController implements IController {

    private ContenedorAutos contenedor;

    public AutoController() {
        this.contenedor = new ContenedorAutos();
    }

    public String AltaAuto(String patente, double velocidad) {
        String error = ValidadorVelocidad.validar(velocidad);
        if (error != null) {
            return error;
        }
        if (contenedor.BuscarAutoXPatente(patente) != null) {
            return "El auto con patente " + patente + " ya existe.";
        }

        contenedor.AltaAuto(new Auto(patente, velocidad));
        return "Auto agregado";
    }

    public String ModificarAuto(String patente, double velocidad) {
        String error = ValidadorVelocidad.validar(velocidad);
        if (error != null) {
            return error;
        }
        Auto existe = contenedor.BuscarAutoXPatente(patente);
        if (existe == null) {
            return "El auto con patente " + patente + " no existe.";
        }

        existe.setVelocidad(velocidad);
        return "Auto modificado";
    }

    public List<Auto> MostrarListaAutos() {
        return contenedor.MostrarListaAutos();
    }
}
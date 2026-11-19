package Controladores;

import java.util.HashMap;
import java.util.Map;

public class ControllerLocator {

    private Map<String, Controlador> controladores;

    public ControllerLocator() {
        this.controladores = new HashMap<>();
    }

    public void registrar(String recurso, Controlador controlador) {
        
        controladores.put(recurso, controlador);
    }

    public Controlador obtener(String recurso) {
        
        return controladores.get(recurso);
    }
}
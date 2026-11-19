package Mains;

import Comunicadores.ComunicadorConsola;
import Contenedores.ContenedorAutos;
import Controladores.AutoControlador;
import Controladores.ControllerLocator;
import Parser.MensajeParser;
import Sesiones.Sesion;

public class Main {

    public static void main(String[] args) {
        ContenedorAutos contenedor = new ContenedorAutos();
        AutoControlador controladorA = new AutoControlador(contenedor);

        ControllerLocator locator = new ControllerLocator();
        locator.registrar("auto", controladorA);

        MensajeParser mensaje = new MensajeParser();
        ComunicadorConsola comunicador = new ComunicadorConsola();

        Sesion sesionInicial = new Sesion(comunicador, locator, mensaje);
        sesionInicial.run();
    }
}
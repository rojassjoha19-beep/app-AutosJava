package Sesiones;
import Interfaces.Comunicador;	
import Controladores.Controlador;
import Controladores.ControllerLocator;
import Parser.Mensaje;
import Parser.MensajeParser;


public class Sesion implements Runnable{

	private Comunicador comunicador ;
	private ControllerLocator locator;
	private MensajeParser parser;
	
	
	
	
	public Sesion(Comunicador comunicador,ControllerLocator locator, MensajeParser parser) {
		super();
		this.comunicador = comunicador;
		this.locator = locator;
		this.parser = parser;
		
	}



	@Override
	public void run() {
		while(true)
		{
		try {
			//para pruebas 
			System.out.println("Ingresar ruta: este formato recurso=auto!accion=alta!parametros=154fgd/parametros=120");
			String mensajeIngresado = comunicador.Recibe();// solo lo lee
			
			Mensaje mensajeParseado = parser.parse(mensajeIngresado);//lo parsea
			
		    Controlador controlador = locator.obtener(mensajeParseado.getRecurso());
		    if (controlador == null) {
                comunicador.Envia("Error: recurso no encontrado -> " + mensajeParseado.getRecurso());
            } else {
                String respuesta = controlador.ProcesarMensaje(mensajeParseado);
                comunicador.Envia(respuesta);
                
                //mensaje.getParametros[2]-> quien creo la sesion por ruta??
                //preguntar por cierre de sesion 
            }
        } catch (Exception e) {
            comunicador.Envia("Error: mensaje invalido (" + e.getMessage() + ")");
        }
			
		
		}
	}
	
	
	
	
	
}
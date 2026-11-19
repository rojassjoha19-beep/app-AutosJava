package Sesiones;
import Comunicadores.ComunicadorConsola;	
import Controladores.Controlador;
import Controladores.ControllerLocator;
import Parser.Mensaje;
import Parser.MensajeParser;


public class Sesion implements Runnable{

	private ComunicadorConsola comunicador ;
	private ControllerLocator locator;
	private MensajeParser parser;
	
	
	
	public Sesion(ComunicadorConsola comunicador,ControllerLocator locator, MensajeParser parser) {
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
			String mensaje = comunicador.Recibe();// solo lo lee
			
			Mensaje mensajee = parser.parse(mensaje);//lo parsea
			
		    Controlador controlador = locator.obtener(mensajee.getRecurso());
		    if (controlador == null) {
                comunicador.Envia("Error: recurso no encontrado -> " + mensajee.getRecurso());
            } else {
                String respuesta = controlador.ProcesarMensaje(mensajee);
                comunicador.Envia(respuesta);
            }
        } catch (Exception e) {
            comunicador.Envia("Error: mensaje inválido (" + e.getMessage() + ")");
        }
			
		
		}
	}
	
	
	
	
	
}
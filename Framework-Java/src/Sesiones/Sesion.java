package Sesiones;
import Comunicadores.ComunicadorConsola;
import Controladores.Controlador;
import Parser.Mensaje;
import Parser.MensajeParser;


public class Sesion implements Runnable{

	private ComunicadorConsola comunicador ;
	private Controlador controlador;
	private MensajeParser parser;
	
	
	
	public Sesion(ComunicadorConsola comunicador,Controlador controlador, MensajeParser parser) {
		super();
		this.comunicador = comunicador;
		this.controlador = controlador;
		this.parser = parser;
	}



	@Override
	public void run() {
		while(true)
		{
		try {
			String mensaje = comunicador.Recibe();// solo lo lee
			
			Mensaje mensajee = parser.parse(mensaje);//lo parsea
			
			controlador.ProcesarMensaje(mensajee);//lo envia a controler   
		}catch(Exception e)
		{
			System.out.println("Error");
		}
		}
	}
	
	
	
	
	
}
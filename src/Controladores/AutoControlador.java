package Controladores;
import Controladores.Controlador;
import Modelos.Auto;
import Contenedores.ContenedorAutos;
import Parser.Mensaje;

public class AutoControlador extends Controlador{
	
	private ContenedorAutos contenedor;

	// se inyecta en el constructor
	
	public AutoControlador(ContenedorAutos contenedor) {
		super();
		this.contenedor = contenedor;
	}
	
	public String ProcesarMensaje(Mensaje mensajee) {
		   String[] parametros = mensajee.getParametros();
		   
		switch(mensajee)
		{
		case"alta":
		{
			String patente = parametros[0].split("=")[1];
			int velocidad = Integer.parseInt(parametros[1].split("=")[1]);

			contenedor.AgregarAuto(new Auto(patente, velocidad));
			return "Auto agregado";
		}
		case "editar":
		{
			String patenteEditar = parametros[0].split("=")[1];
			int velocidadNueva = Integer.parseInt(parametros[1].split("=")[1]);

			// ojo: tu método recibe primero la velocidad y después la patente
			contenedor.EditarVelocidadAuto(velocidadNueva, patenteEditar);
			return "Auto editado";
		}
		case "mostrar":
		{
			
			return contenedor.Mostrar();
		}
		default:
			return "error";
	}
		
		
		
		
		
		
		
		
	}  
	
	
	
}

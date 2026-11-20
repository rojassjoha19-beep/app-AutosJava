package Builder;
import Sesiones.Sesion;
import Interfaces.Comunicador;
import Controladores.ControllerLocator;
import Parser.MensajeParser;

public class BuilderSesion {
	
	private Comunicador comunicador ;
	private ControllerLocator locator;
	private MensajeParser parser;
	
	//constr
	
	public BuilderSesion setComunicador(Comunicador comunicador) {
		 this.comunicador = comunicador;
		 return this;
	}
	
	public BuilderSesion setLocator(ControllerLocator locator) {
		this.locator = locator;
		return this;
	}
	
	public BuilderSesion setParser(MensajeParser parser) {
		 this.parser = parser;
		 return this;
	}
	
	public Sesion build() {
		return new Sesion( comunicador, locator,  parser );
	}
}

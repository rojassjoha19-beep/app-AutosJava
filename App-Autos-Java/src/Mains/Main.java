package Mains;
import Builder.BuilderSesion;
import Comunicadores.ComunicadorConsola;
import Contenedores.ContenedorAutos;
import Controladores.AutoControlador;
import Controladores.ControllerLocator;
import Interfaces.Comunicador;
import Parser.MensajeParser;
import Sesiones.Sesion;

public class Main {

    public static void main(String[] args) {
    	
    	//builder app
    	
    	//builder services
    	
    	//builder.build; sesion.run();
    	 ControllerLocator locator = new ControllerLocator();
    	  
         ContenedorAutos contenedor = new ContenedorAutos();

    	 AutoControlador controladorA = new AutoControlador(contenedor);
         locator.registrar("auto", controladorA);
       
         
         
    	 Sesion sesionInicial = new BuilderSesion()
    			 .setComunicador(new ComunicadorConsola())
    			 .setParser(new MensajeParser())
    			 .setLocator(locator)
    			 .build();
    		
    	 
    	// StringBuilder sb = new StringBuilder();
    	 
    	// sb.append("ho");
    	// sb.append("la");
    	// String s = sb.toString();
    	 //o con factory 
        

       //main -> builder app -> buildersesion, builder locator .... crear sesion factory para crear controladores . 
      //agregar pregunta con factory 
    	 
    	 sesionInicial.run();
    }
}
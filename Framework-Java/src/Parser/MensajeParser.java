package Parser;

public class MensajeParser {

	//recurso//accion//parametros
	// recurso=modelo!accion=metodo!parametro=x/parametro2= x/parametro3=x
	
	public Mensaje parse(String mensaje) {
	
		String[] segmentos = mensaje.split("!");
		
		String recurso = segmentos[0].split("=")[1];

		// segmentos[1] = "accion=metodo"
		String accion = segmentos[1].split("=")[1];
		
		String[] parametros = new String[0];
		
		if(segmentos.length > 2) {
			parametros = segmentos[2].split("/");
		}
		
		return new Mensaje(recurso, accion, parametros);
		
		
	}


}


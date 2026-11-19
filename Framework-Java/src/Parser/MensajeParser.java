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
	//usar builder
		//metodo build 
/*		
		private String tipo;


		private List<Integer> parametros;

		public OperacionBuilder() {
		
			
			parametros = new ArrayList<Integer>();
			
		}


		public OperacionBuilder setOperacion(String tipoOperacion) {
			this.tipo = tipoOperacion;
			return this;
		}
		
		public OperacionBuilder addParametro(int parametro) {
			this.parametros.add(parametro);
			return this;
		}
		
		Metodo build devuelve Objeto operacion , tiene una lista y debe convertir a array
		
		public Operacion build() {
			int tam = parametros.size();
			 int[] vectParametros = new int [tam];
			 int i= 0;
			 for (int parametrosPasar : this.parametros) {
				 vectParametros [i] =parametrosPasar;
				 i++;
			 }
			 
			 return new Operacion (this.tipo, vectParametros);
		
		}
	
		
	}*/


}


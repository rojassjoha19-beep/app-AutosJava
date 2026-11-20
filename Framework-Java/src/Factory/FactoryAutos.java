package Factory;

import Contenedores.ContenedorAutos;
import Controladores.AutoControlador;

public class FactoryAutos extends FactoryControladores {

	public ContenedorAutos contenedor;

	public FactoryAutos(ContenedorAutos contenedor) {
				this.contenedor = contenedor;
	}
	
	public AutoControlador crearControlador()
	{
	return new AutoControlador(contenedor);
	
	}
	
	
}

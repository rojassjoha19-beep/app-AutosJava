package Parser;

public class Mensaje {

	private String recurso;
	private String accion;
	private String[] parametros;

	public Mensaje(String recurso, String accion, String[] parametros) {
		this.recurso = recurso;
		this.accion = accion;
		this.parametros = parametros;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String[] getParametros() {
		return parametros;
	}

	public void setParametros(String[] parametros) {
		this.parametros = parametros;
	}
}
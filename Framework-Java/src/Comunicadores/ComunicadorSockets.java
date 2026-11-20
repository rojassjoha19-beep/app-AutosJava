package Comunicadores;
import Interfaces.Comunicador;
import java.net.Socket;
import java.io.BufferedReader ;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;


public class ComunicadorSockets implements Comunicador{

	PrintWriter salida;
	BufferedReader entrada;
	Socket so;
	 
    public ComunicadorSockets(Socket so)throws IOException {
		this.so = so;
		entrada = new BufferedReader(new InputStreamReader(so.getInputStream()));
		salida= new PrintWriter(so.getOutputStream(), true);
	}
	
	@Override
	public void Envia(String mensaje) {
		salida.print(mensaje);
	}

	@Override
	public String Recibe() {
		
		try {
			return entrada.readLine();
		} catch (IOException e) {
			System.out.println("error");
			return null;
		}
	}

}


package Contenedores;
import java.util.ArrayList;
import Modelos.Auto;

public class ContenedorAutos {

	ArrayList<Auto> ListaAutos = new ArrayList<Auto>();
	
	public void AgregarAuto(Auto nuevoAuto)
	{
		ListaAutos.add(nuevoAuto);
	
	}
	
	public Auto BuscarAutosXPatente(String patente)
	{
		for(int i = 0 ; i < ListaAutos.size() ;i++)
		{
			if(ListaAutos.get(i).getPatente().equals(patente))
			{
				return ListaAutos.get(i);
			}
		
		}
		return null;
	}
	
	public void EditarVelocidadAuto(int Velocidadnueva,String patente)
	{
		Auto auto = BuscarAutosXPatente(patente);
		
		if(auto != null)
		{
		auto.setVelocidad(Velocidadnueva);
		}else
		{
			System.out.println("error");
		}
		
		
	}
	public void Mostrar()
	{
		System.out.println("lista de autos :");
		
		for(int i = 0 ; i < ListaAutos.size() ; i++)
		{
			System.out.println( ListaAutos.get(i).getPatente()+"-" + ListaAutos.get(i).getVelocidad());
		}
		
	}

	
}

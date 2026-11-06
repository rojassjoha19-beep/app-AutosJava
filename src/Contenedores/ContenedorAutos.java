package Contenedores;

import java.util.ArrayList;
import java.util.List;

import Modelos.Auto;

public class ContenedorAutos {

    //tengo que tener los 3 metodos aca y la lista de autos
    //creacion de lista de autos
    List<Auto> listaAutos = new ArrayList<Auto>();
    
    public void AltaAuto(Auto auto)
    {
        listaAutos.add(auto);
    }

     public List<Auto> MostrarListaAutos()
    {
        return listaAutos;
    }

    public Auto BuscarAutoXPatente (String patente)
    {
         for(Auto auto : listaAutos)
        {
            if(auto.getPatente().equals(patente))
            {
               return auto;
            }
        }   

        return null;
    }
}

package Interfaces;
import java.util.List;
import Modelos.Auto;


public interface IController {

    String AltaAuto(String patente, double velocidad);

    String ModificarAuto(String patente, double velocidad);

    List<Auto> MostrarListaAutos();

}




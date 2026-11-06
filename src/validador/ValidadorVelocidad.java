package validador;

public class ValidadorVelocidad {
      public static String validar(double velocidad) {
        if(velocidad < 0)
        {
            return "La velocidad no puede ser negativa.";
        }
        //si esta todo bien tira null
        return null ;
}
}

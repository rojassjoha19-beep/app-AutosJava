package Comunicadores;

import java.util.Scanner;
import Interfaces.Comunicador;

public class ComunicadorConsola implements Comunicador {

    private Scanner sc = new Scanner(System.in);

    @Override
    public void Envia(String pregunta) {
        System.out.println(pregunta);
    }

    @Override
    public String Recibe() {
        return sc.nextLine();
    }
}
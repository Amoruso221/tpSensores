package com.company;
import java.util.*;

public class Mecanico implements Observer {
    private Auto auto;
    private String mecanico;

    public Mecanico()
    {
        this.mecanico = "Miguel";
    }

    @Override
    public void update(Observable o, Object arg) {
        auto = (Auto) o;
        Map datos = (HashMap) arg;
        if(datos.containsKey(1)){
            System.out.println("Cambio en la presion de los neumaticos\nValor viejo: " + datos.get(1) + "\nValor nuevo: " + auto.getPresion_neumaticos());
        }
        else if(datos.containsKey(2))
        {
            System.out.println("Cambio en el nivel de aceite\nValor viejo: " + datos.get(2) + "\nValor nuevo: " + auto.getNivel_aceite());
        }
        else
        {
            System.out.println("Cambio en el nivel de agua\nValor viejo: " + datos.get(3) + "\nValor nuevo: " + auto.getNivel_agua());
        }

    }
}

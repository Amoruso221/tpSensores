package com.company;
import java.util.*;

public class Auto extends Observable {
    private String marca;
    private double ancho;
    private double largo;
    private double peso;
    private String color;

    public double getPresion_neumaticos() {
        return presion_neumaticos;
    }

    public double getNivel_aceite() {
        return nivel_aceite;
    }

    public double getNivel_agua() {
        return nivel_agua;
    }

    private double presion_neumaticos;
    private double nivel_aceite;
    private double nivel_agua;
    private Map datos = new HashMap();

    public Auto(String marca, double ancho, double largo, double peso, String color, double presion_neumaticos, double nivel_aceite, double nivel_agua)
    {
        this.marca = marca;
        this.ancho = ancho;
        this.largo = largo;
        this.peso = peso;
        this.color = color;
        this.presion_neumaticos = presion_neumaticos;
        this.nivel_aceite = nivel_aceite;
        this.nivel_agua = nivel_agua;
    }

    @Override
    public String toString() {
        return ("Marca: " + marca + "\nAncho: " + ancho +"\nLargo: " + largo + "\nPeso: " + peso + "\nColor: " + color + "\nPresion neumaticos: " + presion_neumaticos + "\nNivel aceite: " + nivel_aceite + "\nNivel agua: " + nivel_agua);
    }

    public void setPresion_neumaticos(double presion)
    {
        double old_value = this.presion_neumaticos;
        datos.put(1,old_value);
        this.presion_neumaticos = presion;
        setChanged();
        notifyObservers(datos);
    }

    public void setNivelAceite(double nivel_aceite)
    {
        double old_value = this.nivel_aceite;
        datos.put(2,old_value);
        this.nivel_aceite = nivel_aceite;
        setChanged();
        notifyObservers(datos);
    }

    public void setNivelAgua(double nivel_agua)
    {
        double old_value = this.nivel_agua;
        datos.put(3,old_value);
        this.nivel_agua = nivel_agua;
        setChanged();
        notifyObservers(datos);
    }
}

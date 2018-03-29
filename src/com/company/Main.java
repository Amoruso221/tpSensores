package com.company;

public class Main {

    public static void main(String[] args) {
	    Auto auto1 = new Auto("ford", 3.0, 2.5,100, "rojo", 30.1,10.2, 8.9);
	    Mecanico mecanico1 = new Mecanico();

	    auto1.addObserver(mecanico1);
	    auto1.setPresion_neumaticos(11);
		//  auto1.setNivelAceite(14);
			//  auto1.setNivelAgua(10);
    }
}

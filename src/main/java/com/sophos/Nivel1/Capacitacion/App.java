package com.sophos.Nivel1.Capacitacion;

import com.sophos.Nivel1.Capacitacion.Clase4.Carro;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Carro objCarro = new Carro();
        
    	objCarro.setCantidadLlantas(4);
    	objCarro.setColor("Rojo");
    	objCarro.setTipoFuenteEnergia("Gasolina");
    	
    	System.out.println("El carro tiene " + objCarro.getCantidadLlantas() +" llantas");
    	System.out.println("El carro es de color " + objCarro.getColor());
    	System.out.println("El carro utiliza como fuente de energía la " + objCarro.getTipoFuenteEnergia());
    }
}

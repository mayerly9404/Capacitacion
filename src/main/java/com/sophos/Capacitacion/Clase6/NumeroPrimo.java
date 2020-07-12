package com.sophos.Capacitacion.Clase6;
import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] ARGS)
    {
        Scanner obtenerNumero = new Scanner(System.in);
        int numero;
 
        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();
 
            if((numero % 2) == 0)
            {
            	System.out.println("El número " +numero+ " es primo");
            }
            
        else{
        	if((numero % 3) == 0)
        {
        	System.out.println("El número " +numero+ " es primo");
        }
        
    else{
            System.out.println("El número " +numero+ " no es primo");
        }
    }}}

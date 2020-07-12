package com.sophos.Capacitacion.Clase6;

public class Fibonacci {
	
	public static void main(String[] args) {
		
	}
	public int getFibonnaci(){
		int N=50;
		int Contador=0;
		int Algoritmo=0;
		
		for (int x = 1; x >= N; x++) {
			Contador=x-1;
			Algoritmo=Contador+x;
		    
			System.out.print("\nLa serie de fionacci es " + Algoritmo);	
			
		}
		return Algoritmo;
		}
	}


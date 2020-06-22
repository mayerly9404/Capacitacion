package com.sophos.Nivel1.Capacitacion.Clase4;

public class Vehiculo {

	 public int CantidadLlantas;
	 public String TipoFuenteEnergia;

	 public Vehiculo(){
		 TipoFuenteEnergia = null;
	 }

	public int getCantidadLlantas() {
		return CantidadLlantas;
	}

	public void setCantidadLlantas(int cantidadLlantas) {
		CantidadLlantas = cantidadLlantas;
	}

	public String getTipoFuenteEnergia() {
		return TipoFuenteEnergia;
	}

	public void setTipoFuenteEnergia(String tipoFuenteEnergia) {
		TipoFuenteEnergia = tipoFuenteEnergia;
	}
	 
}

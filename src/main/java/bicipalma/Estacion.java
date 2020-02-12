package bicipalma;

import java.util.concurrent.ThreadLocalRandom;

import bicipalma.Bicicleta;
import bicipalma.TarjetaUsuario;

public class Estacion {
	private int id = 0;
	private String direccion = null;
	private int numAnclajes = 0;
	private final Bicicleta[] anclajes; 
	
	public Estacion(int id, String direccion, int anclajes) {
		
		this.id = id;
		this.direccion = direccion;
		this.numAnclajes = anclajes;
		this.anclajes = new Bicicleta[anclajes];
		
	}

	
	public int getEstaciId() {
		return this.id;
	}
	
	
	public String getDireccion() {
		return this.direccion;
	}
	
	
	public int getNumAnclajes() {
		return this.numAnclajes;
	}

	
	
	public void consultarEstacion() {
		System.out.println("id:" + getEstaciId());
		System.out.println("Direccion:" + getDireccion());
		System.out.println("Numero de anclajes:" + getNumAnclajes());

	}
}


package bicipalma;

import java.util.concurrent.ThreadLocalRandom;

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
	
	public int anclajesLibres() {
		int anclajesLibres = 0;
		
		 for(Bicicleta anclaje: this.anclajes) {
			 if(anclaje == null) {
			 return anclajesLibres++;
			 } 
			 else;
		 }
		 return anclajesLibres;
	}
	
	public void consultarAnclajes() {
		int posicion = 0; 
		int numAnclaje = posicion + 1;
		
		for(Bicicleta bicicleta: this.anclajes) {

			if(bicicleta != null) {
				System.out.println("Anclaje" + numAnclaje + "" + bicicleta.getBiciId());
			}
			else 
				System.out.println("Anclaje" + numAnclaje + "" + " libre");
		}
	}
	
	public void anclarBicicleta(Bicicleta bicicleta) {
		int posicion = 0;
		int numAnclaje = 0;
		
		for(Bicicleta anclaje: this.anclajes) {
			numAnclaje = posicion + 1;
			if(anclaje == null) {
				this.anclajes[posicion] = bicicleta;
				mostrarAnclaje(bicicleta, numAnclaje);
				break;
			}
			else;
			posicion++;
		}
	}
	
	public void mostrarAnclaje(Bicicleta bicicleta, int numAnclaje) {
		System.out.println("bicicleta " + bicicleta.getBiciId() + " anclada en " + numAnclaje);
	}
	
	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
		return tarjetaUsuario.getActivada();
	}
	
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
		
			if(leerTarjetaUsuario(tarjetaUsuario)) {
				boolean biciRetirada = false;
				
				while( !biciRetirada ){
					
					int posicion = generarAnclaje();
					int numAnclaje  = posicion + 1;
					
					if (this.anclajes[posicion] != null){ // leer anclaje
						mostrarBicicleta( this.anclajes[posicion], numAnclaje );
						this.anclajes[posicion] = null;	 // set anclaje
						biciRetirada = true;
					}
					else; // generamos nuevo número de anclaje;
				}
				 
			}
			else
				System.out.println("Tarjeta de usuario inactiva :(");		
		}
	
	public void mostrarBicicleta(Bicicleta bicicleta, int numAnclaje) {
		System.out.println("La bicicleta"+ bicicleta.getBiciId() + "retirada del anclaje" + numAnclaje);
	}
	
	public int generarAnclaje() {
		int numeroEntero = ThreadLocalRandom.current().nextInt(0, this.anclajes.length);
		return numeroEntero;
	}
}


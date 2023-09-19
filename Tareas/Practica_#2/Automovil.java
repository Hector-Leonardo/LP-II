
package automovil;
public class Automovil {
	
	int velocidad = 0;		
	boolean motor = false;		
	String color;				
	String modelo;				
	String marca;			
	static int numeroDeAutos = 0;	

	public Automovil(String fabricante, String tipo){
		this.modelo = tipo;
		this.marca = fabricante;
		numeroDeAutos++;
	}

	public Automovil(String tono, String tipo, String fabricante) {
		this.color = tono;
		this.modelo = tipo;
		this.marca = fabricante;
	}

	public Automovil(int velocidad, boolean motor, String color, String marca, String modelo) {
		this.velocidad = velocidad;
		this.motor = motor;
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
	}

	public Automovil() {
		this(0, false, "Rojo", "Ford", "Fiesta");
	}
	
	public void encenderMotor() {
		motor = true;
		System.out.println("Motor encendido");
	}
	
	public void apagarMotor() {
		motor = false;
		System.out.println("Motor apagado");
	}
	
	public void acelerar(int cantidad) {
		if (motor) {
			velocidad += cantidad;
			System.out.println("Vamos a " + velocidad + " kph");			
		} else {
			System.out.println("El motor est� apagado!");
		}
	}
	
	public void frenar() {
		velocidad = 0;
		System.out.println("Nos hemos detenido!");
	}

	public void frenar(int cantidad) {
		velocidad -= cantidad;
		if (velocidad < 0) velocidad = 0;
		System.out.println("Vamos a " + velocidad + " km/h");
	}
	
	public int verVelocidad() {
		return velocidad;
	}
	
	public void duplicarVelocidad(int velocidad){
		this.velocidad *= 2;
		System.out.println("Ahora vas a " + this.velocidad + " km/h!");
	}
        
	public static int verNumeroDeAutos(){
		return numeroDeAutos;
	}

	public static void pintar(Automovil auto){
		auto.color = "Negro";
	}

	static class Estereo { 
		public void reproducirCancion(String cancion) { 
		System.out.println("Now playing..." + cancion); 
		} 
	} 
		
	class Radiador {
		public void enfriar() {
			if(motor) {
				System.out.println("Enfriando...");
			} else {
				System.out.println("No tengo nada que enfriar");
			}
		}
	}

public static void main(String[] args){

    }
}

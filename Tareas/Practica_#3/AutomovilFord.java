package testerford;
public class AutomovilFord {
	
	int velocidad;						
	String color;						
	public String modelo;					
	Motor motor;						
	public static final String marca = "Ford";	
		

	public AutomovilFord(String modelo, String color){
		this.modelo = modelo;
		this.color = color;
		velocidad = 0;
		motor = new Motor();
	}

	public AutomovilFord(){
		this("EcoSport", "Azul");
	}

	public void encenderMotor() {
		motor.encendido = true;
		System.out.println("Motor encendido");
	}
	
	public void apagarMotor() {
		motor.encendido = false;
		System.out.println("Motor apagado");
	}

	public void acelerar() {
		if (motor.encendido) {
			motor.Revolucionar();		
			velocidad = (motor.revoluciones / 100);
			System.out.println("Vamos a " + velocidad + " kph");			
		} else {
			System.out.println("El motor está apagado!");
		}
	}
	
	public void frenar(int getRevoluciones) {
		
		if(velocidad < 0) velocidad = 0;
		System.out.println("Vamos a " + velocidad + " kph");	
	}
        
	public int getVelocidad() {
		return velocidad;
	}
}

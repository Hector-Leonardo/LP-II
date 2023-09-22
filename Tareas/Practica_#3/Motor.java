package testerford;
import java.util.Random;

public class Motor {
	int revoluciones;		
	int aire;				
	int combustible;		
	boolean piston;		
	boolean bujia;			
	boolean encendido;		
	Random r;			
	
	public Motor() {
		aire = 0;
		combustible = 0;
		revoluciones = 0;
		encendido = false;
		r = new Random();
	}
        
        public void Revolucionar (){
            if(getEncendido()){
                prepararMezcla();
                comprimirMezcla();
                encenderMezcla();
                
            }
        }

    public int getRevoluciones() {
        return revoluciones;
    }

    public void setRevoluciones(int revoluciones) {
        this.revoluciones = revoluciones;
    }

    public boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }


	public void prepararMezcla() {
		while(!(Math.abs(aire - combustible) < 5 && (aire > 50 && combustible > 50))){
			aire += r.nextInt(10);
			combustible += r.nextInt(10);
		}
		piston = false;
	}
	
	public void comprimirMezcla(){
		piston = true;
		bujia = false;
	}
	
	public void encenderMezcla(){
		bujia = true;
		bujia = false;
		double energia = (aire + combustible) * 34.78 / 2;
		revoluciones += (int)(energia / 100);
		piston = false;
		eliminarDesechos(energia);
	}
	
	public void eliminarDesechos(double residuos){
		while(residuos > 0){
			residuos -= r.nextDouble();
  }
 }
}



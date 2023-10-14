package Pokemon;
import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList<Movimiento> movimientos = new ArrayList<>();
    
    public ListaMovimientos(){
        
        movimientos.add(new Movimiento("Garra Metal", 50, 35, Tipo.ACERO));
         
        movimientos.add(new Movimiento("Cuchillada", 70, 10, Tipo.NORMAL));
        movimientos.add(new Movimiento("Furia",20,20,Tipo.NORMAL));
        movimientos.add(new Movimiento("Aranazo", 40, 35, Tipo.NORMAL));
        movimientos.add(new Movimiento("Golpe Cabeza",70,15,Tipo.NORMAL));
        movimientos.add(new Movimiento("Doble Filo", 120, 15, Tipo.NORMAL));

        movimientos.add(new Movimiento("Huesomerang", 50, 10, Tipo.TIERRA));
        movimientos.add(new Movimiento("Hueso Palo", 65, 20, Tipo.TIERRA));
             
        }
    
        public Movimiento buscarMovimientoPorNombre(String nombre){   
            for(Movimiento movimiento: movimientos){
                if (movimiento.getNombre().equals(nombre)){
                    return movimiento;
                }
            }
            return null;
        }
    }

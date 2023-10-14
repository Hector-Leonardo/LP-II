package Pokemon;

public abstract class Pokemon {
    private String nombre;
    private Tipo tipo;
    private int hp = 250;
    private int lvl;
    private Movimiento movimientos [] ;

    public Pokemon(String nombre, Tipo tipo, int lvl) {
        this.lvl = lvl;
        this.nombre = nombre;
        this.tipo = tipo;
        this.movimientos = new Movimiento[4];
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getHp() {
        return hp;
    }

    public int getLvl() {
        return lvl;
    }
  
    public Movimiento getMovimientos(int posicion) {
        return this.movimientos[posicion];
    }
    
    public void setMovimientos(int posicion, Movimiento movimientos) {
        this.movimientos [posicion] = movimientos;
    }
    
    private void calculaDanio(int danio, double efectividad) {
        double puntosRestados = danio * efectividad;
        this.hp -= puntosRestados;
       System.out.printf("%s recibe %.2f puntos de danio\n",this.getNombre(), puntosRestados);
    }
    
    public void recibirAtaque (Movimiento movimiento, double efectividad){
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento.getNombre());
        calculaDanio(movimiento.getPuntosDeAtaque(), efectividad);
        System.out.printf("%s tiene ahora %s puntos de vida \n",this.getNombre(), this.hp);
        
    }
    
     protected boolean seHaConcretadoAtaque(Movimiento movimiento, Pokemon pokemon){
        System.out.printf("\n%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento.getNombre());
        double efectividad= obtenerEfectividad(pokemon);
        
        if (movimiento.getPp()>0){
            pokemon.recibirAtaque(movimiento,efectividad);
            return true;
        }else{
            System.out.println("El movimiento no tiene puntos de pp");
            return false;
        }
    }
     
   public void atacar(int m, Pokemon pokemon) {
        Movimiento movimiento = getMovimientos(m);
        boolean seHaConcretadoAtaque= seHaConcretadoAtaque(movimiento, pokemon);
        if (seHaConcretadoAtaque){
            pokemon.getMovimientos(m).setPp(movimiento.getPp()-1);
        }
    }
    
     public abstract double obtenerEfectividad(Pokemon pokemon);

}

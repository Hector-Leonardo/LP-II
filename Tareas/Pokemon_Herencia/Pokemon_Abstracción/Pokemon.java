package Pokemon;


    public class Pokemon {
    private int hp;
    private int lvl;
    private String nombre;
    private String tipo;

    public Pokemon(int lvl, String nombre, String tipo) {
        this.lvl = lvl;
        this.nombre = nombre;
        this.tipo = tipo;
        this.hp = 100;
    }

    public int getHp() {
        return hp;
    }

    public int getLvl() {
        return lvl;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
    
    private void calculaDanio(int danio) {
        this.hp -= danio;
        System.out.printf("% recibe %d puntos de danio\n", this.getNombre(), danio);
    }
    
    public void recibirAtaque (String movimiento) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento);
        double danioAleatorio = Math.random ();
        calculaDanio((int) (danioAleatorio * 10 + 1));
    }
    
    public void atacar(String movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(), this,getNombre(), pokemon.getNombre(), movimiento);
        pokemon.recibirAtaque(movimiento);
    }

}

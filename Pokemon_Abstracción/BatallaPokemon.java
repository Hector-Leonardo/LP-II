import Pokemon.PokemonFuego;
import Pokemon.PokemonTierra;

public class BatallaPokemon {
    public static void main (String[] args) {
    
    PokemonTierra Cubone = new PokemonTierra ("Cubone", 10);
    PokemonFuego Charmander = new PokemonFuego ("Charmander", 10);
    
    Cubone.atacar(3, Charmander);
    Charmander.atacar(2, Cubone);
    
    }    
}

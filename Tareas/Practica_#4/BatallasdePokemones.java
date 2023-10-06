
public class BatallasdePokemones {
public static void main (String[] args) {
    
    PokemonTierra Cubone = new PokemonTierra (10, "Tipo Tierra");
    PokemonFuego Charmander = new PokemonFuego (10, "Tipo Fuego");
    
    Cubone.atacar("Bone Club", Charmander);
    Charmander.atacar("Ascuas Ember", Cubone);
    
    }    
}

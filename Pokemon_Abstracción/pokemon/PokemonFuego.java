package Pokemon;

public class PokemonFuego extends Pokemon {
    public PokemonFuego(String nombre, int lvl) {
        super(nombre, Tipo.FUEGO, lvl);
        
        ListaMovimientos listaMovimientos = new ListaMovimientos();
        
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Cuchillada"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Furia"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Aranazo"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Garra Metal"));
    }
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        
        if(pokemon.getTipo()== Tipo.ACERO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.BICHO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.HIELO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.PLANTA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.AGUA) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.DRAGON) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.ROCA) efectividad = 0.5;

        return efectividad;
    }
}

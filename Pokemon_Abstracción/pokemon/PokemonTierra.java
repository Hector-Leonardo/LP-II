package Pokemon;

public class PokemonTierra extends Pokemon {
  public PokemonTierra(String nombre, int lvl) {
        super(nombre, Tipo.TIERRA, lvl);
        
        ListaMovimientos listaMovimientos = new ListaMovimientos();
        
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Huesomerang"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Golpe Cabeza"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Hueso Palo"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Doble Filo"));
    }
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo()== Tipo.ACERO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.ELECTRICO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.ROCA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.VENENO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.FUEGO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.BICHO) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.PLANTA) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.VOLADOR) efectividad = 0.0;

        return efectividad;
    }
}
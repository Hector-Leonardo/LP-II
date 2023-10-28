public class Efectividad extends Pokemon {

    public static double obtenerEfectividad(Pokemon atacante, Pokemon oponente) {
        // Obtenemos los tipos del Pokémon atacante y del oponente
        List<Tipo> tiposAtacante = atacante.getTipos();
        List<Tipo> tiposOponente = oponente.getTipos();

        // Calculamos la efectividad de cada tipo del Pokémon atacante contra cada tipo del Pokémon oponente
        Map<Tipo, Double> efectividades = new HashMap<>();
        for (Tipo tipoAtacante : tiposAtacante) {
            for (Tipo tipoOponente : tiposOponente) {
                efectividades.put(tipoOponente, tipoAtacante.obtenerEfectividad(tipoOponente));
            }
        }

        // Calculamos el multiplicador de efectividad total
        double multiplicadorEfectividadTotal = 1.0;
        for (Double efectividad : efectividades.values()) {
            multiplicadorEfectividadTotal *= efectividad;
        }

        return multiplicadorEfectividadTotal;
    }
}

public class Vaporean extends Pokemon {

    public Vaporean(int lvl) {
        super("Vaporeon", 255, 65, 60, 110, 95, 65, lvl);
        this.movimientos.add(new Movimiento("Hydro Pump", 120, Tipo.AGUA));
        this.movimientos.add(new Movimiento("Surf", 90, Tipo.AGUA));
        this.movimientos.add(new Movimiento("Ice Beam", 95, Tipo.HIELO));
    }

    @Override
    public double obtenerEfectividad(Pokemon oponente) {
        if (oponente.getTipo().contains(Tipo.FUEGO) || oponente.getTipo().contains(Tipo.TIERRA)) {
            return 2;
        } else if (oponente.getTipo().contains(Tipo.ROCA) || oponente.getTipo().contains(Tipo.ELECTRICO)) {
            return 0.5;
        } else {
            return 1;
        }
    }
}

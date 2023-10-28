public class Charizard extends Pokemon {

    public Charizard(int lvl) {
        super("Charizard", 350, 84, 78, 100, 100, 85, lvl);
        this.movimientos.add(new Movimiento("Flamethrower", 90, Tipo.FUEGO));
        this.movimientos.add(new Movimiento("Fire Blast", 120, Tipo.FUEGO));
        this.movimientos.add(new Movimiento("Air Slash", 75, Tipo.VOLADOR));
    }

    @Override
    public double obtenerEfectividad(Pokemon oponente) {
        if (oponente.getTipo().contains(Tipo.AGUA) || oponente.getTipo().contains(Tipo.TIERRA)) {
            return 2;
        } else if (oponente.getTipo().contains(Tipo.ROCA) || oponente.getTipo().contains(Tipo.VOLADOR)) {
            return 0.5;
        } else {
            return 1;
        }
    }
}

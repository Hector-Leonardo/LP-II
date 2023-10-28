public abstract class Pokemon {

    protected String nombre;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected int ataqueEspecial;
    protected int defensaEspecial;
    protected int velocidad;
    protected ArrayList<Movimiento> movimientos;

    public Pokemon(String nombre, int hp, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int velocidad) {
        this.nombre = nombre;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.movimientos = new ArrayList<>();
    }

    public abstract double obtenerEfectividad(Pokemon oponente);

    public abstract void recibirAtaque(Movimiento movimiento, double efectividad);

    public abstract void atacar(Movimiento movimiento, Pokemon oponente);ublic double calcularDanioDirecto(Movimiento movimiento, Pokemon oponente) {
        // Obtenemos el daño base del movimiento
        int dañoBase = movimiento.getDañoBase();

        // Obtenemos el multiplicador de efectividad
        double multiplicadorEfectividad = obtenerEfectividad(oponente);

        // Calculamos el daño total
        int dañoTotal = (int) (dañoBase * multiplicadorEfectividad);

        // Aplicamos el modificador de ataque y defensa
        dañoTotal = (int) (dañoTotal * (ataque / oponente.getDefensa()));

        return dañoTotal;
    }
}

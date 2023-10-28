public class Movimiento extends MovimientoLista {

    private String nombre;
    private int pp;
    private int potencia;
    private Tipo tipo;
    private ClaseMovimiento claseMovimiento;

    public Movimiento(String nombre, int pp, int potencia, Tipo tipo, ClaseMovimiento claseMovimiento) {
        this.nombre = nombre;
        this.pp = pp;
        this.potencia = potencia;
        this.tipo = tipo;
        this.claseMovimiento = claseMovimiento;
    } public int movimiento(Pokemon atacante, Pokemon oponente) {
        // Calculamos el daño del movimiento
        int daño = this.potencia * this.claseMovimiento.calcularDanio(atacante, oponente);

        // Aplicamos la efectividad del movimiento
        daño = (int) (daño * this.tipo.getEfectividad(oponente.getTipo()));

        // Aplicamos la defensa del oponente
        daño = (int) (daño / oponente.getDefensa());

        // Aplicamos el efecto secundario del movimiento
        if (this.claseMovimiento.tieneEfectoSecundario()) {
            this.claseMovimiento.aplicarEfectoSecundario(atacante, oponente);
        }

        // Actualizamos los PP del movimiento
        this.pp--;

        // Devolvemos el daño causado
        return daño;
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "nombre='" + nombre + '\'' +
                ", pp=" + pp +
                ", potencia=" + potencia +
                ", tipo=" + tipo +
                ", claseMovimiento=" + claseMovimiento +
                '}';
    }}

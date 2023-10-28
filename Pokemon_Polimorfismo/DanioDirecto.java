public class DanioDirecto extends Pokemon{

    private double bonificacion;
    private double efectividad;
    private int variacion;
    private int lvl;
    private int cantAtaq;
    private int cantDef;

    public DanioDirecto(double bonificacion, double efectividad, int variacion, int lvl, int cantAtaq, int cantDef) {
        this.bonificacion = bonificacion;
        this.efectividad = efectividad;
        this.variacion = variacion;
        this.lvl = lvl;
        this.cantAtaq = cantAtaq;
        this.cantDef = cantDef;
    } public double calcularDanioDirecto(Movimiento movimiento, Pokemon oponente) {
        // Obtenemos el daño base del movimiento
        int dañoBase = movimiento.getDañoBase();

        // Obtenemos el multiplicador de efectividad
        double multiplicadorEfectividad = obtenerEfectividad(oponente);

        // Calculamos el daño total
        int dañoTotal = (int) (dañoBase * multiplicadorEfectividad);

        // Aplicamos el modificador de ataque y defensa
        dañoTotal = (int) (dañoTotal * (cantAtaq / oponente.getDefensa()));

        // Aplicamos la bonificación
        dañoTotal = (int) (dañoTotal * (1 + bonificacion));

        // Aplicamos la variación
        dañoTotal = (int) (dañoTotal + (Math.random() * variacion) - (variacion / 2));

        return dañoTotal;
    } }

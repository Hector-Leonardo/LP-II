public class MovimientoLista {

    private ArrayList<Movimiento> movimientos;

    public MovimientoLista() {
        this.movimientos = new ArrayList<>();
    }

    public void agregarMovimiento(Movimiento movimiento) {
        this.movimientos.add(movimiento);
    }

    public Movimiento obtenerMovimiento(int indice) {
        return this.movimientos.get(indice);
    }

    public int getNumeroMovimientos() {
        return this.movimientos.size();
    }

    public void vaciarLista() {
        this.movimientos.clear();
    }

    @Override
    public String toString() {
        return "MovimientoLista{" +
                "movimientos=" + movimientos +
                '}';
    }
}

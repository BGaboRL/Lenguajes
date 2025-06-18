public class Compras implements Comparable<Compras>{
    private double valor;
    private String descripcion;

    public Compras(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public double getValor() { return valor; }
    public String getDescripcion() { return descripcion; }

    @Override
    public String toString() {
        return "Compra: valor= " + valor + ", descripcion='" + descripcion + "'";
    }

    @Override
    public int compareTo(Compras otraCompra) {
        return Double.compare(this.valor, otraCompra.getValor());
    }
}
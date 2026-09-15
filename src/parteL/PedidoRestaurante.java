public class PedidoRestaurante {
    private String plato;
    private int cantidad;
    private double precioUnitario;
    private boolean entregado;

    public PedidoRestaurante(String plato, int cantidad, double precioUnitario) {
        this.plato = plato;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.entregado = false;
    }

    public double calcularTotal() {
        return this.cantidad * this.precioUnitario;
    }

    public void marcarEntregado() {
        this.entregado = true;
    }

    public void mostrarPedido() {
        System.out.printf("Plato: %s | Cantidad: %d | Total: $%.2f | Entregado: %b%n",
                this.plato, this.cantidad, calcularTotal(), this.entregado);
    }
}

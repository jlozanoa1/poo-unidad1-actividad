public class InventarioItem {
    private String nombre;
    private int cantidad;
    private double precioUnitario;

    public InventarioItem(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularValorTotal() {
        return this.cantidad * this.precioUnitario;
    }

    public void mostrarItem() {
        System.out.printf("Item: %s | Cantidad: %d | Precio unitario: $%.2f | Valor total: $%.2f%n",
                this.nombre, this.cantidad, this.precioUnitario, calcularValorTotal());
    }
}

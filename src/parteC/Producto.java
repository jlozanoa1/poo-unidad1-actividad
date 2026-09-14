public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
        this("Desconocido", 1, 1);
    }

    public void mostrarProducto() {
        System.out.printf("Nombre: %s | precio: $%.2f | Stock: %d%n",
                this.nombre, this.precio, this.stock);
    }

    public void vender(int cantidad) {
        if (cantidad <= this.stock) {
            this.stock -= cantidad;
        }
    }

    public void reabastecer(int cantidad) {
        this.stock += cantidad;
    }
}
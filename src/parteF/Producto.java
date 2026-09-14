public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
        this("Desconocido", 0, 0);
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= this.stock) {
            this.stock -= cantidad;
        }
    }

    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
        }
    }

    public static Producto crearProductoBasico(String nombre) {
        return new Producto(nombre, 1000, 1);
    }

    public void mostrarProducto() {
        System.out.printf("Nombre: %s | Precio: $%.2f | Stock: %d%n",
                this.nombre, this.precio, this.stock);
    }
}

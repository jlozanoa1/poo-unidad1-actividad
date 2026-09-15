public class Ejercicio16 {
    public static void main(String[] args) {
        Producto producto = new Producto("Shampoo Pantene", 7500, 20);

        producto.mostrarProducto();

        producto.reabastecer(10);
        producto.mostrarProducto();
    }
}
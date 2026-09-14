public class Ejercicio15 {
    public static void main(String[] args) {
        Producto producto = new Producto("Shampoo Pantene", 7500, 20);

        producto.mostrarProducto();

        producto.vender(5);
        producto.mostrarProducto();
    }
}
public class Ejercicio31 {
    public static void main(String[] args) {
        // Producto tiene un método fábrica estático llamado crearProductoBasico.
        Producto producto = Producto.crearProductoBasico("Lápiz");
        producto.mostrarProducto();
    }
}

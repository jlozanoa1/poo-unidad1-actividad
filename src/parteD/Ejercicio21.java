public class Ejercicio21 {
    public static void main(String[] args) {
        // Los dos productos tienen el mismo stock, pero diferente nombre y precio.
        Producto producto1 = new Producto("Cuaderno", 5000, 10);
        Producto producto2 = new Producto("Lapicero", 2000, 10);

        producto1.mostrarProducto();
        producto2.mostrarProducto();
    }
}

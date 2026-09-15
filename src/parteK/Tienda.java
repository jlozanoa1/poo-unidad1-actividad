public class Tienda {
    private String nombre;
    private String direccion;
    private double ventasTotales;

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ventasTotales = 0;
    }

    public void registrarVenta(double monto) {
        if (monto > 0) {
            this.ventasTotales += monto;
        }
    }

    public void mostrarTienda() {
        System.out.printf("Tienda: %s | Dirección: %s | Ventas totales: $%.2f%n",
                this.nombre, this.direccion, this.ventasTotales);
    }
}

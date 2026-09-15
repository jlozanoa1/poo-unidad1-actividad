public class Ejercicio64 {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Variedades El Ahorro", "Carrera 15 #22-40");
        tienda.mostrarTienda();

        tienda.registrarVenta(50000);
        tienda.registrarVenta(120000);
        tienda.mostrarTienda();
    }
}

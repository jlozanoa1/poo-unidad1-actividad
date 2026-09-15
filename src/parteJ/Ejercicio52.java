public class Ejercicio52 {
    public static void main(String[] args) {
        FacturaSimple factura = new FacturaSimple("F001", "Marta Díaz", 100000);
        factura.mostrarFactura();

        factura.aplicarDescuento();
        factura.mostrarFactura();
    }
}

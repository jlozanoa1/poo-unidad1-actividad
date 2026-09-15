public class FacturaSimple {
    private String numero;
    private String cliente;
    private double valor;

    public FacturaSimple(String numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public void aplicarDescuento() {
        this.valor -= this.valor * 0.10;
    }

    public void mostrarFactura() {
        System.out.printf("Factura N° %s | Cliente: %s | Valor: $%.2f%n",
                this.numero, this.cliente, this.valor);
    }
}

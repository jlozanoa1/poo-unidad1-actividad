public class CuentaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public CuentaBancaria() {
        this("000", "Desconocido", 1);
    }

    public void mostrarCuenta() {
        System.out.printf("Número: %s | Titular: %s | Saldo: $%.2f%n",
                this.numero, this.titular, this.saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("123456", "Luis Gonzáles", 500000);

        CuentaBancaria cuenta2 = new CuentaBancaria();

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
}

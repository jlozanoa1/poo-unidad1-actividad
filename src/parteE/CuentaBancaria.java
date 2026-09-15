public class CuentaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void consignar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void retirar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    public void mostrarCuenta() {
        System.out.printf("Número: %s | Titular: %s | Saldo: $%.2f%n",
                this.numero, this.titular, this.saldo);
    }
}

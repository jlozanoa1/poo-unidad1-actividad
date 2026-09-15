public class Ejercicio13 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", "Luis Gonzáles", 500000);

        cuenta.mostrarCuenta();

        cuenta.consignar(100000);
        cuenta.mostrarCuenta();
    }
}
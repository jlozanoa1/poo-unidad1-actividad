public class Ejercicio14 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", "Luis Gonzáles", 500000);

        cuenta.mostrarCuenta();

        cuenta.retirar(200000);
        cuenta.mostrarCuenta();

        cuenta.retirar(400000);
        cuenta.mostrarCuenta();
    }
}
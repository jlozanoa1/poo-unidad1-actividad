public class Ejercicio28 {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("001", "Ana", 500000);
        CuentaBancaria cuenta2 = new CuentaBancaria("002", "Carlos", 750000);
        CuentaBancaria cuenta3 = new CuentaBancaria("003", "Laura", 300000);

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
        cuenta3.mostrarCuenta();
    }
}

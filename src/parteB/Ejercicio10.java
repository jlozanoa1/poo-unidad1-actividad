public class Ejercicio10 {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("123456", "Luis Gonzáles", 500000);
        CuentaBancaria cuenta2 = new CuentaBancaria("789012", "Ana Pérez", 750000);

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
}

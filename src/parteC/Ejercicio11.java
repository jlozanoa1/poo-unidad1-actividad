public class Ejercicio11 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", "Picanto", 50);

        vehiculo.mostrarEstado();

        vehiculo.acelerar();
        vehiculo.mostrarEstado();
    }
}
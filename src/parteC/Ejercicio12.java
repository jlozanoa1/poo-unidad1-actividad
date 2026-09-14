public class Ejercicio12 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", "Picanto", 20);

        vehiculo.mostrarEstado();

        vehiculo.frenar();
        vehiculo.mostrarEstado();

        vehiculo.frenar();
        vehiculo.frenar();
        vehiculo.mostrarEstado();
    }
}
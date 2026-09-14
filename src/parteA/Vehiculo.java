public class Vehiculo {
    private String marca;
    private String modelo;
    private double velocidadActual;

    public Vehiculo(String marca, String modelo, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    public Vehiculo() {
        this("Desconocido", "Desconocido", 1);
    }

    public void mostrarEstado() {
        System.out.printf("Marca: %s | Modelo: %s | Velocidad actual: %.2f km/h%n",
                this.marca, this.modelo, this.velocidadActual);
    }

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Picanto", 200);

        Vehiculo vehiculo2 = new Vehiculo();

        vehiculo1.mostrarEstado();
        vehiculo2.mostrarEstado();
    }
}

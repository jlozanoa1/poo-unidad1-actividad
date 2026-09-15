public class Vehiculo {
    private String marca;
    private String modelo;
    private double velocidadActual;

    public Vehiculo(String marca, String modelo, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    public void mostrarEstado() {
        System.out.printf("Marca: %s | Modelo: %s | Velocidad actual: %.2f km/h%n",
                this.marca, this.modelo, this.velocidadActual);
    }
}

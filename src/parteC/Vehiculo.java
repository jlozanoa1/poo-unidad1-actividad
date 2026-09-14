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

    public void acelerar() {
        this.velocidadActual += 10;
    }

    public void frenar() {
        this.velocidadActual -= 10;

        if (this.velocidadActual < 0) {
            this.velocidadActual = 0;
        }
    }
}
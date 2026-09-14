public class Ventilador {
    private String marca;
    private int velocidad;
    private boolean encendido;

    public Ventilador(String marca) {
        this.marca = marca;
        this.velocidad = 0;
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
        this.velocidad = 1;
    }

    public void apagar() {
        this.encendido = false;
        this.velocidad = 0;
    }

    public void subirVelocidad() {
        if (this.encendido && this.velocidad < 3) {
            this.velocidad++;
        }
    }

    public void mostrarEstado() {
        System.out.printf("Marca: %s | Velocidad: %d | Encendido: %b%n",
                this.marca, this.velocidad, this.encendido);
    }
}

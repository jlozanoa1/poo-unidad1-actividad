public class Celular {
    private String marca;
    private int bateria;
    private boolean prendido;

    public Celular(String marca) {
        this.marca = marca;
        this.bateria = 100;
        this.prendido = false;
    }

    public void encender() {
        this.prendido = true;
    }

    public void apagar() {
        this.prendido = false;
    }

    public void cargarBateria() {
        this.bateria = 100;
    }

    public void mostrarEstado() {
        System.out.printf("Marca: %s | Batería: %d%% | Prendido: %b%n",
                this.marca, this.bateria, this.prendido);
    }
}

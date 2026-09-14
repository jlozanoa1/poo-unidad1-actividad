public class Computador {
    private String marca;
    private String procesador;
    private int ramGB;

    public Computador(String marca, String procesador, int ramGB) {
        this.marca = marca;
        this.procesador = procesador;
        this.ramGB = ramGB;
    }

    public void mostrarComputador() {
        System.out.printf("Marca: %s | Procesador: %s | RAM: %d GB%n",
                this.marca, this.procesador, this.ramGB);
    }
}

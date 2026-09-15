public class Lampara {
    private String marca;
    private boolean encendida;

    public Lampara(String marca) {
        this.marca = marca;
        this.encendida = false;
    }

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public void mostrarEstado() {
        System.out.printf("Marca: %s | Encendida: %b%n", this.marca, this.encendida);
    }
}

public class Puerta {
    private String material;
    private boolean abierta;

    public Puerta(String material) {
        this.material = material;
        this.abierta = false;
    }

    public void abrir() {
        this.abierta = true;
    }

    public void cerrar() {
        this.abierta = false;
    }

    public void mostrarEstado() {
        System.out.printf("Material: %s | Abierta: %b%n", this.material, this.abierta);
    }
}

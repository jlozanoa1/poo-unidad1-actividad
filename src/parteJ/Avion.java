public class Avion {
    private String aerolinea;
    private String destino;
    private int pasajeros;

    public Avion(String aerolinea, String destino) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = 0;
    }

    public void abordar(int cantidad) {
        if (cantidad > 0) {
            this.pasajeros += cantidad;
        }
    }

    public void mostrarAvion() {
        System.out.printf("Aerolínea: %s | Destino: %s | Pasajeros a bordo: %d%n",
                this.aerolinea, this.destino, this.pasajeros);
    }
}

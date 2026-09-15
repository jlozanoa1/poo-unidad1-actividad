public class Semaforo {
    private String colorActual;

    public Semaforo() {
        this.colorActual = "rojo";
    }

    public void cambiarColor() {
        if (this.colorActual.equals("rojo")) {
            this.colorActual = "verde";
        } else if (this.colorActual.equals("verde")) {
            this.colorActual = "amarillo";
        } else {
            this.colorActual = "rojo";
        }
    }

    public void mostrarColor() {
        System.out.println("Color actual: " + this.colorActual);
    }
}

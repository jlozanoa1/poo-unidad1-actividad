public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void cambiarRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return 3.1416 * this.radio * this.radio;
    }

    public void mostrarRadio() {
        System.out.println("Radio: " + this.radio);
    }
}

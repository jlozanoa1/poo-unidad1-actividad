public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.base * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }

    public void mostrarResultados() {
        System.out.printf("Base: %.2f | Altura: %.2f | Área: %.2f | Perímetro: %.2f%n",
                this.base, this.altura, calcularArea(), calcularPerimetro());
    }
}

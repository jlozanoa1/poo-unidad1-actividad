public class Ejercicio48 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.0);
        circulo.mostrarRadio();

        // Ahora "this.radio" sí se actualiza correctamente.
        circulo.cambiarRadio(5.0);
        circulo.mostrarRadio();
        System.out.println("Área: " + circulo.calcularArea());
    }
}

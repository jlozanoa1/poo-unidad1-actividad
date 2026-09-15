public class Temperatura {
    private double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double convertirAFahrenheit() {
        return this.celsius * 9 / 5 + 32;
    }

    public void mostrarTemperatura() {
        System.out.printf("%.2f °C equivalen a %.2f °F%n",
                this.celsius, convertirAFahrenheit());
    }
}

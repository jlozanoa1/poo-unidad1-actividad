public class Ejercicio60 {
    public static void main(String[] args) {
        Avion avion = new Avion("Avianca", "Madrid");
        avion.mostrarAvion();

        avion.abordar(120);
        avion.mostrarAvion();

        avion.abordar(35);
        avion.mostrarAvion();
    }
}

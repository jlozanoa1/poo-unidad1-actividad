public class Ejercicio35 {
    public static void main(String[] args) {
        Lampara lampara = new Lampara("Sylvania");
        lampara.mostrarEstado();

        lampara.encender();
        lampara.mostrarEstado();

        lampara.apagar();
        lampara.mostrarEstado();
    }
}

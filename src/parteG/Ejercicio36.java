public class Ejercicio36 {
    public static void main(String[] args) {
        Puerta puerta = new Puerta("Madera");
        puerta.mostrarEstado();

        puerta.abrir();
        puerta.mostrarEstado();

        puerta.cerrar();
        puerta.mostrarEstado();
    }
}

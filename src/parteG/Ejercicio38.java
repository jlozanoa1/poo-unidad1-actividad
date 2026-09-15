public class Ejercicio38 {
    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador("Samurai");
        ventilador.mostrarEstado();

        ventilador.encender();
        ventilador.mostrarEstado();

        ventilador.subirVelocidad();
        ventilador.subirVelocidad();
        ventilador.mostrarEstado();

        ventilador.apagar();
        ventilador.mostrarEstado();
    }
}

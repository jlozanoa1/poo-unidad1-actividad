public class Ejercicio37 {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung");
        celular.mostrarEstado();

        celular.encender();
        celular.mostrarEstado();

        celular.cargarBateria();
        celular.mostrarEstado();

        celular.apagar();
        celular.mostrarEstado();
    }
}

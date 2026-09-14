public class Ejercicio9 {
    public static void main(String[] args) {
        Mascota mascota = new Mascota("Max", "Perro", 3);

        mascota.mostrarMascota();

        mascota.setEdad(4);
        mascota.mostrarMascota();

        mascota.setEdad(5);
        mascota.mostrarMascota();
    }
}

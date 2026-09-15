public class Ejercicio73 {
    public static void main(String[] args) {
        Mascota original = new Mascota("Toby", "Perro", 4);
        Mascota copia = new Mascota(original);

        original.mostrarMascota();
        copia.mostrarMascota();
    }
}

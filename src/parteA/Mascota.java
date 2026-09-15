public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public Mascota() {
        this("Desconocido", "Desconocido", 1);
    }

    public void mostrarMascota() {
        System.out.printf("Nombre: %s | Especie: %s | Edad: %d años%n",
                this.nombre, this.especie, this.edad);
    }

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Max", "Perro", 3);

        Mascota mascota2 = new Mascota();

        mascota1.mostrarMascota();
        mascota2.mostrarMascota();
    }
}

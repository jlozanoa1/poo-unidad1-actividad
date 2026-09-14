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

    public void cumplirAnios() {
        this.edad++;
    }
}

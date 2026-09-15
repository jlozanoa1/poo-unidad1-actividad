public class Pelicula {
    private String nombre;
    private String genero;
    private int minutos;

    public Pelicula(String nombre, String genero, int minutos) {
        this.nombre = nombre;
        this.genero = genero;
        this.minutos = minutos;
    }

    public void mostrarFicha() {
        System.out.printf("Nombre: %s | Género: %s | Duración: %d min%n",
                this.nombre, this.genero, this.minutos);
    }
}

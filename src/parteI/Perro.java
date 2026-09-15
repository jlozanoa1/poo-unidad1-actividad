public class Perro {
    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public void ladrar() {
        System.out.println(this.nombre + " dice: ¡Guau!");
    }
}

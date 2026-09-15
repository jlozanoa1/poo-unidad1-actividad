public class Gato {
    private String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public void maullar() {
        System.out.println(this.nombre + " dice: ¡Miau!");
    }
}

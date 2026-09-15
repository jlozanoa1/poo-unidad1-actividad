public class Ejercicio71 {
    public static void main(String[] args) {
        // Antes: se hubiera creado el auto vacío y usado varios setters.
        // Ahora: todo se asigna en una sola línea gracias al constructor
        // con parámetros.
        Auto auto = new Auto("Mazda", "Rojo", 210);
        auto.mostrarAuto();
    }
}

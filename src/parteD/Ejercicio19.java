public class Ejercicio19 {
    public static void main(String[] args) {
        // Estudiante es una clase porque es la plantilla que define los atributos y métodos.
        // est1 es un objeto porque es una instancia concreta creada a partir de la clase Estudiante.
        Estudiante est1 = new Estudiante("Ana", "101", "2");

        est1.mostrarInfo();
    }
}

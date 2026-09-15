public class Ejercicio42 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Programación Orientada a Objetos", 4, "John Carlos Arrieta Arrieta");
        Curso curso2 = new Curso("Bases de Datos", 3, "Carlos Cáceres Ochoa");

        curso1.mostrarCurso();
        curso2.mostrarCurso();

        System.out.println();
        System.out.println(
                "Aunque curso1 y curso2 tienen datos distintos (nombre, número de créditos " +
                        "y profesor diferentes), ambos pertenecen a la misma clase Curso porque una " +
                        "clase no define valores fijos, sino la estructura y el comportamiento que " +
                        "cualquier curso debe tener: qué atributos posee y qué puede hacer. Los " +
                        "objetos son instancias particulares de esa estructura, cada una con su " +
                        "propio estado almacenado en su propio espacio de memoria. Por eso dos " +
                        "objetos pueden diferenciarse completamente en sus datos y seguir siendo del mismo " +
                        "tipo: la clase es el molde compartido, y cada objeto es una copia " +
                        "independiente creada a partir de él.");
    }
}

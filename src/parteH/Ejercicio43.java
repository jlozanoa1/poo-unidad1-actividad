public class Ejercicio43 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell", "Intel i7", 16);
        computador.mostrarComputador();

        System.out.println();
        System.out.println(
                "La clase Computador es el plano conceptual: describe, de manera abstracta, qué " +
                        "atributos tendrá cualquier computador (marca, procesador, RAM) y qué puede " +
                        "hacer, pero no representa ningún equipo físico en particular ni ocupa " +
                        "memoria como un objeto real. Cuando se ejecuta 'new Computador(...)', se " +
                        "construye una máquina concreta partiendo de ese plano: una instancia con " +
                        "valores específicos y una dirección de memoria propia, así como un plano de " +
                        "construcción no es una casa habitable pero permite levantar tantas casas " +
                        "reales como se necesite siguiendo el mismo diseño.");
    }
}

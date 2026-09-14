public class Ejercicio44 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Luis Fernández", 45, "Hipertensión");
        paciente.mostrarPaciente();

        System.out.println();
        System.out.println(
                "\"Crear un paciente\" es una idea del mundo real, alguien llega a una " +
                        "clínica, se le abre una historia clínica y a partir de ese momento existe " +
                        "como persona atendida. \"Instanciar la clase Paciente\" es la operación " +
                        "técnica que usa el programa para representar esa realidad dentro del " +
                        "sistema en el que se está trabajando, reservando memoria y asignando valores a " +
                        "los atributos definidos en la clase. Ambas ideas están relacionadas porque la instancia " +
                        "en código modela al paciente real, pero no son lo mismo: la primera " +
                        "pertenece al dominio del problema (el mundo que se quiere representar) y la " +
                        "segunda pertenece al dominio de la solución (cómo el lenguaje de " +
                        "programación construye esa representación en memoria).");
    }
}

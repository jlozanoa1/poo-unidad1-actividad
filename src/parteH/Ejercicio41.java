public class Ejercicio41 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Sofía Restrepo", "Analista", 2500000);
        empleado.mostrarEmpleado();

        empleado.aumentarSalario(10);
        empleado.mostrarEmpleado();

        System.out.println();
        System.out.println(
                "Modelar a Empleado como clase es mejor que usar variables sueltas " +
                        "(nombreEmpleado, cargoEmpleado, salarioEmpleado) porque la clase agrupa " +
                        "esos datos en una sola unidad coherente, evitando que se dispersen o se " +
                        "desincronicen entre sí. Además, los métodos como aumentarSalario() quedan " +
                        "encapsulados junto con los datos que modifican, haciendo que la lógica de " +
                        "negocio vaya siempre con la información a la que pertenece. Con variables " +
                        "sueltas, cada empleado nuevo obligaría a crear más variables independientes " +
                        "y funciones que reciban muchos parámetros, lo que vuelve el código difícil " +
                        "de mantener y mucho más propenso a errores; con objetos, basta con instanciar la clase " +
                        "las veces que se necesite.");
    }
}

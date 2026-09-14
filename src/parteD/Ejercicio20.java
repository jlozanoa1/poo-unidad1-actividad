public class Ejercicio20 {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Picanto", 50);
        Vehiculo vehiculo2 = new Vehiculo("Mazda", "CX-5", 70);
        Vehiculo vehiculo3 = new Vehiculo("Renault", "Logan", 30);

        vehiculo1.mostrarEstado();
        vehiculo2.mostrarEstado();
        vehiculo3.mostrarEstado();

        /*
         * Los tres objetos comparten la misma clase Vehiculo, por lo que tienen
         * los mismos atributos y métodos. Se diferencian en los valores que
         * guardan en sus atributos: cada vehículo tiene su propia marca,
         * modelo y velocidad actual.
         */
    }
}

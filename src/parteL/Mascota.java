// Se reescribe otro ejercicio inicial (una clase Mascota con nombre, especie
// y edad) añadiéndole un constructor copia, similar al implementado antes
// en la clase Libro (Ejercicio 33).

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public Mascota(Mascota otra) {
        this(otra.nombre, otra.especie, otra.edad);
    }

    public void mostrarMascota() {
        System.out.printf("Nombre: %s | Especie: %s | Edad: %d años%n",
                this.nombre, this.especie, this.edad);
    }
}

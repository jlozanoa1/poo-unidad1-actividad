// NOTA: como no se cuenta con el archivo original de los primeros ejercicios
// (Parte A), se toma como referencia un ejercicio típico inicial: una clase
// Auto construida originalmente con constructor vacío y "setters" para
// asignar cada atributo por separado. Aquí se reescribe usando un
// constructor con parámetros, que asigna todo en una sola instrucción.

public class Auto {
    private String marca;
    private String color;
    private int velocidadMaxima;

    public Auto(String marca, String color, int velocidadMaxima) {
        this.marca = marca;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarAuto() {
        System.out.printf("Marca: %s | Color: %s | Velocidad máxima: %d km/h%n",
                this.marca, this.color, this.velocidadMaxima);
    }
}

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d%n", this.hora, this.minuto, this.segundo);
    }
}

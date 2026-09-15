public class NotaAcademica {
    private String asignatura;
    private double nota1;
    private double nota2;
    private double nota3;

    public NotaAcademica(String asignatura, double nota1, double nota2, double nota3) {
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularDefinitiva() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public void mostrarNota() {
        System.out.printf("Asignatura: %s | Definitiva: %.2f%n",
                this.asignatura, calcularDefinitiva());
    }
}

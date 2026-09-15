public class Semestre {
    private int numero;
    private int creditosMatriculados;
    private double promedioAcumulado;
    private boolean enCurso;

    public Semestre(int numero, int creditosMatriculados, double promedioAcumulado, boolean enCurso) {
        this.numero = numero;
        this.creditosMatriculados = creditosMatriculados;
        this.promedioAcumulado = promedioAcumulado;
        this.enCurso = enCurso;
    }

    public void finalizar() {
        this.enCurso = false;
    }

    public void actualizarPromedio(double nuevoPromedio) {
        this.promedioAcumulado = nuevoPromedio;
    }

    public void mostrarSemestre() {
        System.out.printf("Semestre %d | Créditos: %d | Promedio: %.2f | En curso: %b%n",
                this.numero, this.creditosMatriculados, this.promedioAcumulado, this.enCurso);
    }
}

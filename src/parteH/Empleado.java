public class Empleado {
    private String nombre;
    private String cargo;
    private double salario;

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100);
        }
    }

    public void mostrarEmpleado() {
        System.out.printf("Nombre: %s | Cargo: %s | Salario: $%.2f%n",
                this.nombre, this.cargo, this.salario);
    }
}

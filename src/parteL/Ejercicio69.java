public class Ejercicio69 {
    public static void main(String[] args) {
        System.out.println("=== Semestre (5 objetos) ===");
        Semestre semestre1 = new Semestre(1, 16, 3.8, false);
        Semestre semestre2 = new Semestre(2, 17, 4.0, false);
        Semestre semestre3 = new Semestre(3, 18, 3.5, false);
        Semestre semestre4 = new Semestre(4, 19, 4.2, false);
        Semestre semestre5 = new Semestre(5, 18, 4.1, true);
        semestre1.mostrarSemestre();
        semestre2.mostrarSemestre();
        semestre3.mostrarSemestre();
        semestre4.mostrarSemestre();
        semestre5.mostrarSemestre();

        System.out.println();
        System.out.println("=== RutinaDiaria (5 objetos) ===");
        RutinaDiaria rutina1 = new RutinaDiaria("Levantarse", "06:00", 15);
        RutinaDiaria rutina2 = new RutinaDiaria("Desayunar", "06:30", 20);
        RutinaDiaria rutina3 = new RutinaDiaria("Ir a clases", "07:00", 240);
        RutinaDiaria rutina4 = new RutinaDiaria("Estudiar Java", "19:00", 90);
        RutinaDiaria rutina5 = new RutinaDiaria("Dormir", "23:00", 420);
        rutina1.mostrarActividad();
        rutina2.mostrarActividad();
        rutina3.mostrarActividad();
        rutina4.mostrarActividad();
        rutina5.mostrarActividad();

        System.out.println();
        System.out.println("=== PedidoRestaurante (5 objetos) ===");
        PedidoRestaurante pedido1 = new PedidoRestaurante("Bandeja paisa", 2, 25000);
        PedidoRestaurante pedido2 = new PedidoRestaurante("Ajiaco", 1, 18000);
        PedidoRestaurante pedido3 = new PedidoRestaurante("Sancocho", 3, 20000);
        PedidoRestaurante pedido4 = new PedidoRestaurante("Ensalada", 1, 12000);
        PedidoRestaurante pedido5 = new PedidoRestaurante("Jugo natural", 4, 6000);
        pedido1.mostrarPedido();
        pedido2.mostrarPedido();
        pedido3.mostrarPedido();
        pedido4.mostrarPedido();
        pedido5.mostrarPedido();
    }
}

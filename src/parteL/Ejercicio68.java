public class Ejercicio68 {
    public static void main(String[] args) {
        // Clase libre relacionada con un negocio: los pedidos de un restaurante.
        PedidoRestaurante pedido = new PedidoRestaurante("Bandeja paisa", 2, 25000);
        pedido.mostrarPedido();

        pedido.marcarEntregado();
        pedido.mostrarPedido();
    }
}

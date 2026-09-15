public class Ejercicio59 {
    public static void main(String[] args) {
        UsuarioSistema usuario = new UsuarioSistema("jperez", "abc123");
        usuario.mostrarUsuario();

        usuario.activar();
        usuario.mostrarUsuario();

        usuario.desactivar();
        usuario.mostrarUsuario();
    }
}

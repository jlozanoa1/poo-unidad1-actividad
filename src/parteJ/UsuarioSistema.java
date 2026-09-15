public class UsuarioSistema {
    private String nombreUsuario;
    private String clave;
    private boolean activo;

    public UsuarioSistema(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = false;
    }

    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }

    public void mostrarUsuario() {
        System.out.printf("Usuario: %s | Activo: %b%n", this.nombreUsuario, this.activo);
    }
}

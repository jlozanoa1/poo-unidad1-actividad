public class Hospital {
    private String nombre;
    private String ciudad;
    private int camasDisponibles;

    public Hospital(String nombre, String ciudad, int camasDisponibles) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.camasDisponibles = camasDisponibles;
    }

    public void ocuparCama() {
        if (this.camasDisponibles > 0) {
            this.camasDisponibles--;
        }
    }

    public void liberarCama() {
        this.camasDisponibles++;
    }

    public void mostrarHospital() {
        System.out.printf("Hospital: %s | Ciudad: %s | Camas disponibles: %d%n",
                this.nombre, this.ciudad, this.camasDisponibles);
    }
}

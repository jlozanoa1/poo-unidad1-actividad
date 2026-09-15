public class Ejercicio63 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital San Rafael", "Bogotá", 30);
        hospital.mostrarHospital();

        hospital.ocuparCama();
        hospital.ocuparCama();
        hospital.mostrarHospital();

        hospital.liberarCama();
        hospital.mostrarHospital();
    }
}

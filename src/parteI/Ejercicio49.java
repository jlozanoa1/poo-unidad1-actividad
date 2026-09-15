public class Ejercicio49 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana");
        Persona persona2 = new Persona("Luis");

        // El acceso ahora se hace a través del getter público.
        System.out.println(persona1.getNombre());
        System.out.println(persona2.getNombre());
    }
}

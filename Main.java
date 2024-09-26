
public class Main {
    public static void main(String[] args) {
        //instancia de Persona
        Persona persona = new Persona("Juan", 30, "Masculino", "Mexicana", "Ingeniero");
        persona.setNombre("Juan Pérez");
        System.out.println("Nombre: " + persona.getNombre());

        //instancia de Estudiante
        Estudiante estudiante = new Estudiante("Carlos", 22, "Masculino", "Mexicana", "Estudiante", "12345", "Ingeniería");
        estudiante.estudiar("Matemáticas");
        estudiante.dormir("6");
        
        //método static comer
        Persona.comer("Pizza");
    }
}

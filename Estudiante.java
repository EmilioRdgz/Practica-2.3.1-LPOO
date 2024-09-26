
public class Estudiante extends Persona {
    private String matricula;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, int edad, String genero, String nacionalidad, String ocupacion, String matricula, String carrera) {
        super(nombre, edad, genero, nacionalidad, ocupacion);  //se llama al constructor de la superclase Persona
        this.matricula = matricula;
        this.carrera = carrera;
    }

    // Métodos Set y Get propios de Estudiante
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Método de Estudiante
    public void estudiar(String materia) {
        System.out.println(getNombre() + " está estudiando " + materia);
    }

    // Método dormir para Estudiante
    protected void dormir(String horas) {
        System.out.println(getNombre() + " como estudiante ha dormido " + horas + " horas por estudiar.");
    }
}

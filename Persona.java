
public class Persona {
    private String nombre;      // atributo privado
    protected int edad;         // atributo protegido
    String genero;
    String nacionalidad;
    String ocupacion;

    // constructor
    public Persona(String nombre, int edad, String genero, String nacionalidad, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.ocupacion = ocupacion;
    }

    // Métodos Set y Get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    //Método protegido
    protected void dormir(String horas) {
        System.out.println(nombre + " ha dormido por " + horas + " horas.");
    }

    // Método privado
    private void tomarShower(String duracion) {
        System.out.println(nombre + " se baño por " + duracion + " minutos.");
    }

    //método static
    public static void comer(String comida) {
        System.out.println("Comiendo " + comida);
    }
}


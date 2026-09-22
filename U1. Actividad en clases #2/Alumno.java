public class Alumno {

    private String matricula;
    private String nombre;
    private Tutor tutor;

    public Alumno(String matricula, String nombre, Tutor tutor) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.tutor = tutor;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void mostrarDatos() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nombre: " + nombre);

        if (tutor != null) {
            System.out.println("Tutor: " + tutor.getNombre());
        } else {
            System.out.println("Tutor: Sin asignar");
        }
    }
}
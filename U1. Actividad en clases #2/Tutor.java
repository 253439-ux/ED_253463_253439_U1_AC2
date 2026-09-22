public class Tutor {

    private int idTutor;
    private String nombre;

    public Tutor(int idTutor, String nombre) {
        this.idTutor = idTutor;
        this.nombre = nombre;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarDatos() {
        System.out.println("ID Tutor: " + idTutor);
        System.out.println("Nombre: " + nombre);
    }
}
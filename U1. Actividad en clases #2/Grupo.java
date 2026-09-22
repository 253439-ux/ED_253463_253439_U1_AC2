public class Grupo {

    private String nombre;
    private Alumno[] alumnos;
    private int contador;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new Alumno[28];
        this.contador = 0;
    }

    public void agregarAlumno(Alumno alumno) {

        if (contador < 28) {
            alumnos[contador] = alumno;
            contador++;
        } else {
            System.out.println("El grupo ya tiene 28 alumnos.");
        }
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarAlumnos() {

        System.out.println("\n===== GRUPO " + nombre + " =====");

        for (int i = 0; i < contador; i++) {

            System.out.println("\nAlumno " + (i + 1));

            alumnos[i].mostrarDatos();
        }
    }
}
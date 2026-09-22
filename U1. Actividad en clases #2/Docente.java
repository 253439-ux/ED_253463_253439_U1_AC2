public class Docente {

    private String nombre;
    private String materia;
    private Grupo[] grupos;

    public Docente(String nombre, String materia) {
        this.nombre = nombre;
        this.materia = materia;
        this.grupos = new Grupo[2];
    }

    public void agregarGrupo(Grupo grupo, int posicion) {

        if (posicion >= 0 && posicion < 2) {
            grupos[posicion] = grupo;
        } else {
            System.out.println("Posicion no valida.");
        }
    }

    public void mostrarGrupos() {

        System.out.println("Docente: " + nombre);
        System.out.println("Materia: " + materia);

        for (int i = 0; i < grupos.length; i++) {

            if (grupos[i] != null) {
                grupos[i].mostrarAlumnos();
            }
        }
    }

    public Grupo getGrupos(int posicion) {
        return grupos[posicion];
    }
}
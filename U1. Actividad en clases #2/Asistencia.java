public class Asistencia {

    private Alumno alumno;
    private String estado;
    private String dia;
    private String semana;

    public Asistencia(Alumno alumno, String estado, String dia, String semana) {
        this.alumno = alumno;
        this.estado = estado;
        this.dia = dia;
        this.semana = semana;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public String getEstado() {
        return estado;
    }

    public String getDia() {
        return dia;
    }

    public String getSemana() {
        return semana;
    }

    public void mostrar() {
        System.out.println("Alumno: " + alumno.getNombre());
        System.out.println("Matricula: " + alumno.getMatricula());
        System.out.println("Estado: " + estado);
        System.out.println("Dia: " + dia);
        System.out.println("Semana: " + semana);
    }
}
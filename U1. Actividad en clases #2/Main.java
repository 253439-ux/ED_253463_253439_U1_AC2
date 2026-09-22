public class Main {

    public static void main(String[] args) {

        // Crear docente
        Docente docente = new Docente(
                "Diana",
                "Estructura de Datos"
        );

        // Crear grupos
        Grupo grupoA = new Grupo("A");
        Grupo grupoB = new Grupo("B");

        // Agregar grupos al docente
        docente.agregarGrupo(grupoA, 0);
        docente.agregarGrupo(grupoB, 1);

        // Crear tutores
        Tutor tutor1 = new Tutor(1, "Alejandro");
        Tutor tutor2 = new Tutor(2, "Horacio");
        Tutor tutor3 = new Tutor(3, "Renan");

        // Crear alumnos
        Alumno alumno1 = new Alumno(
                "253439",
                "Emiliano Romero",
                tutor1
        );

        Alumno alumno2 = new Alumno(
                "253438",
                "Marco Cobos",
                tutor2
        );

        Alumno alumno3 = new Alumno(
                "253655",
                "Jahaziel",
                tutor3
        );

        // Agregar alumnos a los grupos
        grupoA.agregarAlumno(alumno1);
        grupoA.agregarAlumno(alumno2);

        grupoB.agregarAlumno(alumno3);

        // Arreglo estático de asistencias
        Asistencia[] asistencias = new Asistencia[100];
        int contadorAsistencias = 0;

        // Registrar asistencias
        asistencias[contadorAsistencias] =
                new Asistencia(
                        alumno1,
                        "Faltó",
                        "Lunes",
                        "Semana 1"
                );
                
        contadorAsistencias++;

        asistencias[contadorAsistencias] =
                new Asistencia(
                        alumno2,
                        "Faltó",
                        "Martes",
                        "Semana 1"
                );
        contadorAsistencias++;

        asistencias[contadorAsistencias] =
                new Asistencia(
                        alumno3,
                        "Faltó",
                        "Miércoles",
                        "Semana 1"     
                );
        contadorAsistencias++;

        // Mostrar reporte
        System.out.println("\n======================================");
        System.out.println("     REPORTE SEMANAL DE INASISTENCIAS");
        System.out.println("======================================");

        for (int i = 0; i < contadorAsistencias; i++) {

            if (asistencias[i].getEstado().equals("Faltó")) {

                System.out.println("\nAlumno: "
                        + asistencias[i].getAlumno().getNombre());

                System.out.println("Matricula: "
                        + asistencias[i].getAlumno().getMatricula());

                System.out.println("Dia: "
                        + asistencias[i].getDia());

                System.out.println("Semana: "
                        + asistencias[i].getSemana());

                System.out.println("--------------------------------------");
            }
        }
    }
}
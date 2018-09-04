package entregable1;

public class Main {

    public static void main(String[] args) {
        DigitalHouseManager dhmanager = new DigitalHouseManager();


        dhmanager.altaCurso( "Full Stack",20001, 3);
        dhmanager.altaCurso("Android", 20002, 3);


        dhmanager.altaProfesorTitular("Peter", "prof1.1", 1,"Android");
        dhmanager.altaProfesorAdjunto("Pat", "prof1.2", 2, 4);

        dhmanager.altaProfesorTitular("profesorTitular2", "prof2.1", 3,"Full Stack");
        dhmanager.altaProfesorAdjunto("profesorAdjunto2", "prof2.2", 4, 8);


        Alumno alumno1 = new Alumno(1, "Juan1", "Perez1");
        Alumno alumno2 = new Alumno(2, "Juan2", "Perez2");
        Alumno alumno3 = new Alumno(3, "Juan3", "Perez3");

        dhmanager.altaAlumno("Juan1", "Perez1", 1);
        dhmanager.altaAlumno("Juan2", "Perez3", 2);
        dhmanager.altaAlumno("Juan3", "Perez3", 3);


        dhmanager.inscribirAlumno(1, 20001);
        dhmanager.inscribirAlumno(2, 20001);

        dhmanager.inscribirAlumno(1, 20002);
        dhmanager.inscribirAlumno(2, 20002);
        dhmanager.inscribirAlumno(3, 20002);

        dhmanager.bajaCurso(20001);
        dhmanager.bajaProfesor(3);

        /*1. ¿Cómo modificaría el diagrama de clases para que se le pueda consultar a un alumno a qué
        cursos está inscripto?

        a. Crearía un método en la clase DigitalHouseManager denominado getCursosPorAlumno.
           Recibe un un código de alumno.
        b. obtengo el alumno a partir del métod getAlumnoPorCodigo.
        c. recorro lo

        */

    }
}

package entregable1;

import java.util.Date;

public class Inscripcion {
    private Alumno alumno;
    private Curso curso;
    private Date fecha;

    public Inscripcion(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
        this.fecha = new Date();
    }
}

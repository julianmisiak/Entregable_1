
package entregable1;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Alumno> alumnos = new ArrayList<>();
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Inscripcion> inscripciones = new ArrayList<>();

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
        Curso curso = new Curso(codigoCurso, nombre, cupoMaximoDealumnos);
        cursos.add(curso);
    }

    private Curso getCursoPorCodigo(Integer codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }

    private Alumno getAlumnoPorCodigo(Integer codigo) {
        for (Alumno alumno : alumnos) {
            if (alumno.getCodigo().equals(codigo)) {
                return alumno;
            }
        }
        return null;
    }

    private Profesor getProfesorPorCodigo(Integer codigo) {
        for (Profesor profesor : profesores) {
            if (profesor.getCodigo().equals(codigo)) {
                return profesor;
            }
        }
        return null;
    }

    private ProfesorTitular getProfesorTitularPorCodigo(Integer codigo) {
        ProfesorTitular profesorTitular = null;
        try {
            profesorTitular = (ProfesorTitular) getProfesorPorCodigo(codigo);
        } catch (ClassCastException e) {
            System.out.println("El código no corresponde a un 'profesor titular'");
        }

        return profesorTitular;
    }

    private ProfesorAdjunto getProfesorAdjuntoPorCodigo(Integer codigo) {
        ProfesorAdjunto profesorAdjunto = null;
        try {
            profesorAdjunto = (ProfesorAdjunto) getProfesorPorCodigo(codigo);
        } catch (ClassCastException e) {
            System.out.println("El código no corresponde a un 'profesor adjunto'");
        }

        return profesorAdjunto;
    }


    public void bajaCurso(Integer codigoCurso) {
        Curso curso = getCursoPorCodigo(codigoCurso);
        cursos.remove(curso);
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        ProfesorAdjunto profesorAdjunto = new ProfesorAdjunto(cantidadDeHoras, nombre, apellido, cantidadDeHoras);
        profesores.add(profesorAdjunto);
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        ProfesorTitular profesorTitular = new ProfesorTitular(codigoProfesor, nombre, apellido, especialidad);
        profesores.add(profesorTitular);
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno alumno = new Alumno(codigoAlumno, nombre, apellido);
        alumnos.add(alumno);
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
        Curso curso = getCursoPorCodigo(codigoCurso);
        if (curso == null) {
            System.out.println("El código: '" + codigoCurso + "' no corresponde a ningún curso");
            return;
        }

        if (!curso.hayCupo()) {
            System.out.println("Nop hay cupo disponible, no se puede efectuar la inscripción");
            return;
        }
        Alumno alumno = getAlumnoPorCodigo(codigoAlumno);
        if (alumno == null) {
            System.out.println("El código: '" + codigoAlumno + "' no corresponde a ningún alumno");
            return;
        }

        Inscripcion inscripcion = new Inscripcion(alumno, curso);
        inscripciones.add(inscripcion);

        System.out.println("El Alumno " + alumno.toString() + " se ha inscribido al curso: " + curso.toString());
    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {
        ProfesorTitular profesorTitular = getProfesorTitularPorCodigo(codigoProfesorTitular);
        if (profesorTitular == null) {
            System.out.println("El código: '" + codigoProfesorTitular + "' no corresponde a ningún profesor");
            return;
        }

        ProfesorAdjunto profesorAdjunto = getProfesorAdjuntoPorCodigo(codigoProfesorAdjunto);
        if (profesorAdjunto == null) {
            System.out.println("El código: '" + codigoProfesorAdjunto + "' no corresponde a ningún profesor");
            return;
        }

        Curso curso = getCursoPorCodigo(codigoCurso);
        if (curso == null) {
            System.out.println("El código: '" + codigoCurso + "' no corresponde a ningún curso");
            return;
        }

        curso.setProfesorTitular(profesorTitular);
        curso.setProfesorAdjunto(profesorAdjunto);
        cursos.remove(curso);
        cursos.add(curso);
    }

    public void bajaProfesor(Integer codigoProfesor) {
        Profesor profesor = getProfesorPorCodigo(codigoProfesor);
        if (profesor == null) {
            System.out.println("El código: '" + codigoProfesor + "' no corresponde a ningún profesor");
            return;
        }

        profesores.remove(profesor);
        System.out.println("El Profesor '" + profesor.getNombre() + " " + profesor.getApellido() + " fue dado de baja");
    }

}

package entregable1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private Integer codigo;
    private String nombre;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private Integer cupoMaximno;
    private List<Alumno> alumnos = new ArrayList<>();


    public Curso(Integer codigo, String nombre, Integer cupoMaximno) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupoMaximno = cupoMaximno;
    }

    public Curso(Integer codigo, String nombre, ProfesorTitular profesorTitular, ProfesorAdjunto profesorAdjunto, Integer cupoMaximno) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesorTitular = profesorTitular;
        this.profesorAdjunto = profesorAdjunto;
        this.cupoMaximno = cupoMaximno;
    }


    public Boolean hayCupo(){
        return alumnos.size()< cupoMaximno;
    }

    public Boolean agregarUnAlumno(Alumno unAlumno){
        if(hayCupo()){
            alumnos.add(unAlumno);
            return true;
        }
        return false;
    }

    public void eliminarAlumno(Alumno unAlumno){
        alumnos.remove(unAlumno);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ProfesorTitular getProfesorTitular() {
        return profesorTitular;
    }

    public void setProfesorTitular(ProfesorTitular profesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    public ProfesorAdjunto getProfesorAdjunto() {
        return profesorAdjunto;
    }

    public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }

    public Integer getCupoMaximno() {
        return cupoMaximno;
    }

    public void setCupoMaximno(Integer cupoMaximno) {
        this.cupoMaximno = cupoMaximno;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public String toString() {
        return "Codigo=" + codigo +
                "\nNombre='" + nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigo, curso.codigo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(codigo);
    }
}

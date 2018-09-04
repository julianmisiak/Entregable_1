package entregable1;

import java.util.Objects;

public class Alumno {
    private Integer codigo;
    private String nombre;
    private String apellido;

    public Alumno(Integer codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return  "Codigo=" + codigo +
                "\nNombre= " + nombre + " " +
                "\nApellido = " + apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(codigo, alumno.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}

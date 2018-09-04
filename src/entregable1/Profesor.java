package entregable1;

import java.util.Objects;

public abstract class Profesor {
    private Integer antiguedad;
    private Integer codigo;
    private String nombre;
    private String apellido;

    public Profesor(Integer codigo, String nombre, String apellido) {
        this.antiguedad = 0;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(codigo, profesor.codigo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(codigo);
    }
}

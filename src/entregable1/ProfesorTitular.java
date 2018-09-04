package entregable1;

public class ProfesorTitular extends  Profesor {
    private String especialidad;

    public ProfesorTitular(Integer codigo, String nombre, String apellido, String especialidad) {
        super(codigo, nombre, apellido);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

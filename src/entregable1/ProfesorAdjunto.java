package entregable1;

public class ProfesorAdjunto extends  Profesor {
    private Integer cantidadHoras;

    public ProfesorAdjunto(Integer codigo, String nombre, String apellido, Integer cantidadHoras) {
        super(codigo, nombre, apellido);
        this.cantidadHoras = cantidadHoras;
    }

    public Integer getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(Integer cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
}

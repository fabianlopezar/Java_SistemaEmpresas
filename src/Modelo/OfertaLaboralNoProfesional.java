package Modelo;

import java.util.LinkedList;

public final class OfertaLaboralNoProfesional extends OfertaLaboral {

    private String ocupacion;
    private int anoExperiencia;
    private boolean esBachiller;

    public OfertaLaboralNoProfesional(String ocupacion, int anoExperiencia, boolean esBachiller, String numero, String fechaApertura, String fechaCierre, int numeroVacantes, String nombreCargo, String descripcion, LinkedList<String> requisitos, boolean requiereViajar) {
        super(numero, fechaApertura, fechaCierre, numeroVacantes, nombreCargo, descripcion, requisitos, requiereViajar);
        this.ocupacion = ocupacion;
        this.anoExperiencia = anoExperiencia;
        this.esBachiller = esBachiller;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getAnoExperiencia() {
        return anoExperiencia;
    }

    public void setAnoExperiencia(int anoExperiencia) {
        this.anoExperiencia = anoExperiencia;
    }

    public boolean isEsBachiller() {
        return esBachiller;
    }

    public void setEsBachiller(boolean esBachiller) {
        this.esBachiller = esBachiller;
    }

    @Override
    public String toString() {
        return "OfertaLaboralNoProfesional{" + "ocupacion=" + ocupacion + ", anoExperiencia=" + anoExperiencia + ", esBachiller=" + esBachiller + '}';
    }

    public int calcularSalarioMensual() {
        int aux = 0;
        return aux;
    }

}

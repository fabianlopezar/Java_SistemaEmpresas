package Modelo;

import java.util.LinkedList;

public final class OfertaLaboralProfesional extends OfertaLaboral {

    private FormacionAcademica suUltimaFormacionAcademica;

    public OfertaLaboralProfesional(FormacionAcademica suUltimaFormacionAcademica, String numero, String fechaApertura, String fechaCierre, int numeroVacantes, String nombreCargo, String descripcion, LinkedList<String> requisitos, boolean requiereViajar) {
        super(numero, fechaApertura, fechaCierre, numeroVacantes, nombreCargo, descripcion, requisitos, requiereViajar);
        this.suUltimaFormacionAcademica = suUltimaFormacionAcademica;
    }

    public FormacionAcademica getSuUltimaFormacionAcademica() {
        return suUltimaFormacionAcademica;
    }

    public void setSuUltimaFormacionAcademica(FormacionAcademica suUltimaFormacionAcademica) {
        this.suUltimaFormacionAcademica = suUltimaFormacionAcademica;
    }

    @Override
    public String toString() {
        return "OfertaLaboralProfesional{" + "suUltimaFormacionAcademica=" + suUltimaFormacionAcademica + '}';
    }

    public int calcularSalarioMensual() {
        int aux = 0;
        return aux;
    }
}

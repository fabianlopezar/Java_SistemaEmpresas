package Modelo;

import java.util.LinkedList;

public abstract class OfertaLaboral {

    protected String numero;
    protected String fechaApertura;
    protected String fechaCierre;
    protected int numeroVacantes;
    protected String nombreCargo;
    protected String descripcion;
    protected LinkedList<String> requisitos;
    protected boolean requiereViajar;

    public OfertaLaboral(String numero, String fechaApertura, String fechaCierre, int numeroVacantes, String nombreCargo, String descripcion, LinkedList<String> requisitos, boolean requiereViajar) {
        this.numero = numero;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.numeroVacantes = numeroVacantes;
        this.nombreCargo = nombreCargo;
        this.descripcion = descripcion;
        this.requisitos = requisitos;
        this.requiereViajar = requiereViajar;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public int getNumeroVacantes() {
        return numeroVacantes;
    }

    public void setNumeroVacantes(int numeroVacantes) {
        this.numeroVacantes = numeroVacantes;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LinkedList<String> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(LinkedList<String> requisitos) {
        this.requisitos = requisitos;
    }

    public boolean isRequiereViajar() {
        return requiereViajar;
    }

    public void setRequiereViajar(boolean requiereViajar) {
        this.requiereViajar = requiereViajar;
    }

    @Override
    public String toString() {
        return "OfertaLaboral{" + "numero=" + numero + ", fechaApertura=" + fechaApertura + ", fechaCierre=" + fechaCierre + ", numeroVacantes=" + numeroVacantes + ", nombreCargo=" + nombreCargo + ", descripcion=" + descripcion + ", requisitos=" + requisitos + ", requiereViajar=" + requiereViajar + '}';
    }

    public abstract int calcularSalarioMensual();

    public void agregarRequisito(String nuevoRequisito) {
        requisitos.add(nuevoRequisito);
    }

    public String consultarPrimerRequisito() {
        String reporte = "PRIMER RESUISITO: ";
        reporte += requisitos.getFirst();
        return reporte;
    }

    public String consultarUltimoRequisito() {
        String reporte = "";
        reporte += requisitos.getLast();
        return reporte;
    }

    public void eliminarPrimerRequisito() {
        requisitos.removeFirst();
    }

    public void eliminarUltimoRequisito() {
        requisitos.removeLast();
    }
}

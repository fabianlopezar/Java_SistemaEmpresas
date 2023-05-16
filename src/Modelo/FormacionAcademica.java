package Modelo;

public class FormacionAcademica {

    private String titulo;
    private boolean esPosgrado;
    private int anoGraduacion;

    public FormacionAcademica(String titulo, boolean esPosgrado, int anoGraduacion) {
        this.titulo = titulo;
        this.esPosgrado = esPosgrado;
        this.anoGraduacion = anoGraduacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEsPosgrado() {
        return esPosgrado;
    }

    public void setEsPosgrado(boolean esPosgrado) {
        this.esPosgrado = esPosgrado;
    }

    public int getAnoGraduacion() {
        return anoGraduacion;
    }

    public void setAnoGraduacion(int anoGraduacion) {
        this.anoGraduacion = anoGraduacion;
    }

    @Override
    public String toString() {
        return "FormacionAcademica{" + "titulo=" + titulo + ", esPosgrado=" + esPosgrado + ", anoGraduacion=" + anoGraduacion + '}';
    }

}

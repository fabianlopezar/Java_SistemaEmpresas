package Modelo;

import java.util.LinkedList;

public class Empresa {

    private String nit;
    private String razonSocial;
    private String direccion;
    private String ciudad;
    private char sectorEconomico;
    private LinkedList<OfertaLaboral> susOfertasLaborales;

    public Empresa(String nit, String razonSocial, String direccion, String ciudad, char sectorEconomico, LinkedList<OfertaLaboral> susOfertasLaborales) {
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.sectorEconomico = sectorEconomico;
        this.susOfertasLaborales = susOfertasLaborales;
    }

    public Empresa(String nit, String razonSocial, String direccion, String ciudad, char sectorEconomico) {
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.sectorEconomico = sectorEconomico;
        this.susOfertasLaborales = new LinkedList<>();
    }

    

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public char getSectorEconomico() {
        return sectorEconomico;
    }

    public void setSectorEconomico(char sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
    }

    public LinkedList<OfertaLaboral> getSusOfertasLaborales() {
        return susOfertasLaborales;
    }

    public void setSusOfertasLaborales(LinkedList<OfertaLaboral> susOfertasLaborales) {
        this.susOfertasLaborales = susOfertasLaborales;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nit=" + nit + ", razonSocial=" + razonSocial + ", direccion=" + direccion + ", ciudad=" + ciudad + ", sectorEconomico=" + sectorEconomico + ", susOfertasLaborales=" + susOfertasLaborales + '}';
    }

    public void agregarOfertaLaboral(OfertaLaboral nuevaOfertaLaboral) {
        susOfertasLaborales.add(nuevaOfertaLaboral);
    }

    public OfertaLaboral consultarPrimeraOfertaLaboral() {
        return susOfertasLaborales.getFirst();
    }

    public OfertaLaboral consultarUtimaOfertaLaboral() {
        return susOfertasLaborales.getLast();
    }

    public void eliminarPrimeraOfertaLaboral() {
        susOfertasLaborales.removeFirst();
    }

    public void eliminarUltimafertaLaboral() {
        susOfertasLaborales.removeLast();
    }
}

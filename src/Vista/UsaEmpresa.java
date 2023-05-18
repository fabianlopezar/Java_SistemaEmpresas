//hola soy una prueba de git 
package Vista;

import Modelo.Empresa;
import Modelo.OfertaLaboral;
import java.util.LinkedList;

public class UsaEmpresa {

    static LinkedList<Empresa> lasEmpresas;

    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static void mostrarReporte(String reporte) {

    }

    public static void registrarEmpresa() {
        //Atributos Empresa
        String nit = "1";
        String razonSocial = "x";
        String direccion = "c";
        String ciudad = "s";
        char sectorEconomico = "e".charAt(0);
        //Creando 
        Empresa nuevaEmpresa = new Empresa(nit, razonSocial, direccion, ciudad, sectorEconomico);
    }

    public static void agregarUnaOfertaLaboralAUnaEmpresa(String nitEmpresa, OfertaLaboral nuevaOfertaLaboral) {
        for (Empresa elem : lasEmpresas) {
            if (elem.getNit().equals(nitEmpresa)) {
                elem.agregarOfertaLaboral(nuevaOfertaLaboral);
            }
        }
    }

    //tengo una clase Empresa y esta tiene relacion de asocioacion multiple con Ofertas Laborales.
    public static String generarReporteTodasLasOfertasLaborales() {
        String reporte = "REPORTE TODAS LAS OFERTAS LABORALES: ";
        for (Empresa elem : lasEmpresas) {
            if (elem.getSusOfertasLaborales().size() != 0) {
                reporte += elem.getSusOfertasLaborales();
            }
        }

        return reporte;
    }

    public static String generarReporteOfertasLaboralesSectorEconomico(char sectorEconomico) {
        String reporte = "REPORTE OFERTAS LABORALES SECTOR ECONOMICO: ";
        for (Empresa elem : lasEmpresas) {
            if (elem.getSectorEconomico() == sectorEconomico) {
            }//if
        }//for
        return reporte;
    }//clase
}

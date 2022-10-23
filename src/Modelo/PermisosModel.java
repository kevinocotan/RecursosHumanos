
package Modelo;

/*
AUTOR: Kevin Alexander Ocotan Morales
DESCRIPCION: Esta clase cumple su funcionalidad de contener dentro las variables,
             el metodo constructor de los seis datos que se solicitaban y sus 
             setters y getters. Al final tambien se encuentra un metodo abstracto,
             que nos ayudara a obter el codigo del empleado.
VERSION: 1.1
 */

public class PermisosModel {
    private int codpermiso;
    private int codemp;
    private int tipo;
    private String fecha;
    private String hora;
    private String observaciones;

    public PermisosModel(int codpermiso, int codemp, int tipo, String fecha, String hora, String observaciones) {
        this.codpermiso = codpermiso;
        this.codemp = codemp;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.observaciones = observaciones;
    }

    public int getCodpermiso() {
        return codpermiso;
    }

    public void setCodpermiso(int codpermiso) {
        this.codpermiso = codpermiso;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
   
    
    @Override
    public int hashCode() {
        return this.getCodemp(); 
    }
   
}

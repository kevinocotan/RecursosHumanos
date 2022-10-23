/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MSI
 */
public class CargosModel {
    private long codcargo;
    private String cargo;
    private double sueldo;

    public CargosModel(long codcargo, String cargo, double sueldo) {
        this.codcargo = codcargo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public long getCodcargo() {
        return codcargo;
    }

    public void setCodcargo(long codcargo) {
        this.codcargo = codcargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return this.getCargo();
    }
    
    
}

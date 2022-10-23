/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import DAO.CargosDAO;
import Modelo.CargosModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MSI
 */
public class CargosTableModel extends AbstractTableModel {
    
    private CargosDAO cargosDAO;
    
    private List <CargosModel> datos = new ArrayList<CargosModel>();
    
    public CargosTableModel(CargosDAO cargosDAO) {
        this.cargosDAO=cargosDAO;       
    }
    
    public void updateModel() {
        this.datos=this.cargosDAO.getAll();       
    }
    
    @Override
    public String getColumnName(int column){
        switch (column) {
            case 0: return "Codigo";
            case 1: return "Cargo";
            case 2: return "Sueldo";
            default: return "";
        }
    }
         
    @Override
    public int getRowCount() {
        return this.datos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CargosModel obj = this.datos.get(rowIndex);
        switch (columnIndex) {
            case 0: return obj.getCodcargo();
            case 1: return obj.getCargo();
            case 2: return obj.getSueldo();
            default: return "";
        }
    }
         
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DAO.CargosDAO;
import java.util.List;

/**
 *
 * @author MSI
 */
public class TestConnection {
    public static void main(String[] args) {
        /*ConexionDB c= new ConexionDB();
        System.out.println(c.conexion());
        System.out.println(c.getError());
        */
        CargosDAO obj= new CargosDAO();
        List<CargosModel> lista= obj.getAll();
        System.out.println(lista.get(2).getCargo());
        System.out.println(lista.get(2).getSueldo());
        CargosModel record = obj.getOne(3);
        System.out.println(record.getCargo());
        System.out.println(record.getSueldo());
        CargosModel in=new CargosModel (0, "Maestro", 600);
        obj.insertar(in);
        
    }
    
    
}

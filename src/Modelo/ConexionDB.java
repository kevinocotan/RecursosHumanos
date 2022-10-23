/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author MSI
 */
public class ConexionDB {
    public Connection conn=null;
    public Statement stmt=null;
    public ResultSet res=null;
    private String error="";
    
    public boolean conexion(){
        String login="unicaes";
        String password="catolica10";
        String url="jdbc:mysql://81.171.6.88/recursos_humanos";
        try {
            this.conn=DriverManager.getConnection(url,login,password);
            if (this.conn!=null){
                this.stmt=this.conn.createStatement();
                return true;
            }
            return false;
        } catch (SQLException ex) {
            this.setError(ex.getMessage());
            return false;
       }      
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }            
}
    

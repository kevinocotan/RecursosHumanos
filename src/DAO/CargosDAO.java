/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.CargosModel;
import Modelo.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI
 */
public class CargosDAO extends ConexionDB {
    private String allRecord="SELECT * FROM cargos";
    private String oneRecord="SELECT * FROM cargos WHERE codcargo =?";
    private String insertRecord="INSERT INTO cargos (cargo, sueldo) VALUES (?,?)";
    private String updateRecord="UPDATE cargos SET cargo=?, sueldo=? WHERE codcargo=?";
    private String deleteRecord="DELETE FROM cargos WHERE codcargo=?";
    
    //Metodo constructor
    public CargosDAO() {
        this.conexion();
    }
    
    //Metodos de consulta   
    public List<CargosModel> getAll() {
        /*
        La clase List se le conoce como colecciones.
        */
        List<CargosModel> cargos = new ArrayList<CargosModel>();
        try {
            //Lanzar la consulta
            this.res=this.stmt.executeQuery(allRecord);
            //Recorren los registros
            while (this.res.next()) {
                cargos.add(this.covertirResultSet(res));
            }            
        } catch (SQLException e ) {
            e.printStackTrace();
        }   
        return cargos;
        
    }
        
    private CargosModel covertirResultSet(ResultSet res) {
        CargosModel recordcargo=null;
        try {
            long codcargo=res.getLong("codcargo");
            String cargo=res.getString("cargo");
            double sueldo=res.getDouble("sueldo");
            recordcargo = new CargosModel (codcargo,cargo,sueldo);                             
        } catch (SQLException e) {
            e.printStackTrace();
        } 
          return recordcargo;
    }   
        
    public CargosModel getOne(long id) {
        PreparedStatement sta=null;
        ResultSet re=null;
        CargosModel c=null;
        try {
            sta=this.conn.prepareStatement(this.oneRecord);
            sta.setLong(1, id);
            re=sta.executeQuery();
            if (re.next()) {
                c=this.covertirResultSet(re);               
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (sta!=null) {
                try {
                    sta.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }       
        return c;
    }   
    
    public void insertar(CargosModel cargo) {
        PreparedStatement sta=null;
        try {
            sta=this.conn.prepareStatement(this.insertRecord);
            sta.setString(1, cargo.getCargo());
            sta.setDouble(2, cargo.getSueldo());
            sta.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (sta!=null) {
                try {
                    sta.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public void update(CargosModel cargo) {
        PreparedStatement sta=null;
        try {
            sta=this.conn.prepareStatement(this.updateRecord);
            sta.setString(1, cargo.getCargo());
            sta.setDouble(2, cargo.getSueldo());
            sta.setDouble(3, cargo.getCodcargo());
            sta.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (sta!=null) {
                try {
                    sta.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }          
    }
    
    public void delete (CargosModel cargo) {        
        PreparedStatement sta=null;
        try {
            sta=this.conn.prepareStatement(this.deleteRecord);
            sta.setDouble(1, cargo.getCodcargo());
            sta.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (sta!=null) {
                try {
                    sta.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
}

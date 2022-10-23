
package DAO;

import Modelo.PermisosModel;
import Modelo.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
AUTOR: Kevin Alexander Ocotan Morales
DESCRIPCION: En esta clase, tenemos todas las consultas de SQL, las importacion 
             de la conexion, y el List. Con ello tambien vienen otras importaciones
             de la Libreria de SQL.
             En cada seccion del cogigo, se realizara el proceso del que se esta
             hablando en SQL, desde el insertar hasta el borrar adaptado a nuestro
             formulario.
VERSION: 1.1
 */

public class PermisosDAO extends ConexionDB {
    private String allRecord="SELECT * FROM permisos";
    private String oneRecord="SELECT * FROM permisos WHERE codpermiso =?";
    private String insertRecord="INSERT INTO permisos (codemp, tipo, fecha, hora, observaciones) VALUES (?,?,?,?,?)";
    private String updateRecord="UPDATE permisos SET codemp=?, tipo=?, fecha=?, hora=?, observaciones=? WHERE codpermiso=?";
    private String deleteRecord="DELETE FROM permisos WHERE codpermiso=?";   
    
    //Metodo constructor
    public PermisosDAO() {
        this.conexion();
    }
    
    //Metodos de consulta   
    public List<PermisosModel> getAll() {
        /*
        La clase List se le conoce como colecciones.
        */
        List<PermisosModel> permisos = new ArrayList<PermisosModel>();
        try {
            //Lanzar la consulta
            this.res=this.stmt.executeQuery(allRecord);
            //Recorren los registros
            while (this.res.next()) {
                permisos.add(this.covertirResultSet(res));
            }            
        } catch (SQLException e ) {
            e.printStackTrace();
        }   
        return permisos;
        
    }
    
    private PermisosModel covertirResultSet(ResultSet res) {
        PermisosModel recordpermisos=null;
        try {
            int codpermiso=res.getInt("codpermiso");
            int codemp=res.getInt("codemp");
            int tipo=res.getInt("tipo");
            String fecha=res.getString("fecha");
            String hora=res.getString("hora");
            String observaciones=res.getString("observaciones");            
            recordpermisos = new PermisosModel (codpermiso,codemp,tipo,fecha,hora,observaciones);                             
        } catch (SQLException e) {
            e.printStackTrace();
        } 
          return recordpermisos;
    }
    
     public PermisosModel getOne(int id) {
        PreparedStatement sta=null;
        ResultSet re=null;
        PermisosModel c=null;
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
    
     public void insertar(PermisosModel permisos) {
        PreparedStatement sta=null;
        try {
            sta=this.conn.prepareStatement(this.insertRecord);
            sta.setInt(1, permisos.getCodemp());
            sta.setInt(2, permisos.getTipo());
            sta.setString(3, permisos.getFecha());
            sta.setString(4, permisos.getHora());
            sta.setString(5, permisos.getObservaciones());           
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
     
    public void update(PermisosModel permisos) {
        PreparedStatement sta=null;
        try {
            sta=this.conn.prepareStatement(this.updateRecord);
            sta.setInt(1, permisos.getCodemp());
            sta.setInt(2, permisos.getTipo());
            sta.setString(3, permisos.getFecha());
            sta.setString(4, permisos.getHora());
            sta.setString(5, permisos.getObservaciones());  
            sta.setInt(6, permisos.getCodpermiso());
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
    
    public void delete (PermisosModel permisos) {        
        PreparedStatement sta=null;
        try {
            sta=this.conn.prepareStatement(this.deleteRecord);
            sta.setInt(1, permisos.getCodpermiso());
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

    
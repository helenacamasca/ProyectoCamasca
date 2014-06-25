/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.epeu.camasca.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pe.edu.epeu.camasca.config.conexion;

/**
 *
 * @author alum.fial7
 */
public class IglesiaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    private int op;
    public int registrarIglesia(int idd,int idti,String nom, int cuenta){
       sql = "INSERT INTO iglesia VALUES('"+idd+"', '"+idti+"','"+nom+"','"+cuenta+"')"; 
       try{
           cx = conexion.getConexion();
           st = cx.createStatement();
           op=st.executeUpdate(sql);
       }catch (SQLException e){
       }
       return op;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.epeu.camasca.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.epeu.camasca.config.conexion;
import pe.edu.epeu.camasca.modelo.Iglesia;

/**
 *
 * @author alum.fial7
 */
public class IglesiaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<Iglesia> lista = null;
    public ArrayList<Iglesia> listarIglesia(){
        lista = new ArrayList();
        sql ="SELECT * FROM iglesia";
        try{
        cx = conexion.getConexion();
        st = cx.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
                Iglesia igl = new Iglesia();
                igl.setIdi(rs.getInt(""));
                igl.setIdd(rs.getInt(""));
                igl.setIdti(rs.getInt(""));
                igl.setNomiglesia(rs.getString(""));
                igl.setCuenta(rs.getInt(""));
        }
        }catch (Exception e){
        }
        return lista;
    }
    
}

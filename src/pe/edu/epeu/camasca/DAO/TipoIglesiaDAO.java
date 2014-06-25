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
import pe.edu.epeu.camasca.modelo.TipoIglesia;

/**
 *
 * @author alum.fial7
 */
public class TipoIglesiaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<TipoIglesia> lista = null;
    public ArrayList<TipoIglesia> listarTipoIglesia(){
        lista = new ArrayList();
        sql ="SELECT * FROM tipo_iglesia";
        try{
        cx = conexion.getConexion();
        st = cx.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
                TipoIglesia ti = new TipoIglesia();
                ti.setIdti(rs.getInt("idtipo_iglesia"));
                ti.setNomtipo(rs.getString("tipo_iglesia"));
                
                lista.add(ti);
        }
        }catch (Exception e){
        }
        return lista;
    }
    
}

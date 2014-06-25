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
import pe.edu.epeu.camasca.modelo.Persona;

/**
 *
 * @author alum.fial7
 */
public class PersonaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<Persona> lista = null;
    public ArrayList<Persona> listarPersona(){
        lista = new ArrayList();
        sql ="SELECT * FROM persona";
        try{
        cx = conexion.getConexion();
        st = cx.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
            
        }
        }catch (Exception e){
        }
        return lista;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class Procedimientos {
       public static void NuevoProducto(String a, String b, String c)throws SQLException{
        CallableStatement entrada = ClsConexion.getConexion().prepareCall("{call NuevoProducto(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.execute();
    }
    
    public static void EliminarProducto(int a)throws SQLException{
        CallableStatement entrada = ClsConexion.getConexion().prepareCall("{call EliminarProducto(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarProducto(int a)throws SQLException{
        CallableStatement entrada = ClsConexion.getConexion().prepareCall("{call BuscarProducto(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }

}

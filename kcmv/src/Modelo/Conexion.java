/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author josel
 */
public class Conexion {
    Connection con;
          Statement St;
 /*Creando la instania de conexion */
    public Conexion() {

        try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con =DriverManager.getConnection("jdbc:odbc:kcm"); // el nombre es el mismo de la imagen 3
            if (con != null)
            {
                 System.out.println();
                 System.out.println("Successfully connected");
                 System.out.println();
                 System.out.println("\nDriver Information");
            }
}
        catch ( SQLException excepcionSql)
        {
            JOptionPane.showMessageDialog( null, excepcionSql.getMessage(),"Error en base de datos", JOptionPane.ERROR_MESSAGE );
        }

        catch ( ClassNotFoundException claseNoEncontrada )
        {
            JOptionPane.showMessageDialog( null, claseNoEncontrada.getMessage(),"No se encontró el controlador", JOptionPane.ERROR_MESSAGE );
        }
}
    
     public ResultSet executeQuery(String query) throws SQLException{ 
               
       Statement statement = con.createStatement(); 
       return statement.executeQuery(query); 
    } 

     
//Metodo de ejecucion de insert,update,delete a la base de datos
          public String cone(String sql) 
          {
           String error="";
           try
           {
              St=con.createStatement();
              St.executeQuery(sql);
           }
           catch(Exception ex)
           {
             error = ex.getMessage();
           }
          return(error);
          }
       
 //Metodo para las consultas a la base de datos
              public ResultSet Consulta(String sql)
                {
                    ResultSet res = null;
                    try
                    {
                        Statement s = con.createStatement();
                        res = s.executeQuery(sql);
                    } catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                    return res;
                }
    
}

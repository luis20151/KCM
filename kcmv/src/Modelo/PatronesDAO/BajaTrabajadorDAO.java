/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.PatronesDAO;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author josel
 */
public class BajaTrabajadorDAO {
    
    public void eliminarPersona(String codigo)
{
//   try{
//            Modelo.Conexion conex=new Modelo.Conexion();
//            Statement cst = conex.con.createStatement();
//   cst.execute("exec sp_eliminar "+codigo);
//
//            JOptionPane.showMessageDialog(null,"Baja Realizada, del Sistema Cruzsoft");
//   System.out.println("Usuario con id  "+codigo+"  Se a dado de baja, del Sistema Cruzsoft");
//            cst.close();
//            conex.con.close();
//
//        } catch(SQLException enlace){JOptionPane.showMessageDialog(null,"Fallo Enlace, Sistema  "+enlace);
//        
//        Consulta_UsuarioVO  d=new  Consulta_UsuarioVO();
//            d.setVisible(true);
//            
//        }
        
    String sql = "exec sp_eliminar "+codigo;
        Object instance = Modelo.ConnectionDao.getInstance();
    JOptionPane.showMessageDialog(null,"Baja Realizada, del Sistema KCM");
    System.out.println("Usuario con id  "+codigo+"  Se a dado de baja, del Sistema KCM");
}
}

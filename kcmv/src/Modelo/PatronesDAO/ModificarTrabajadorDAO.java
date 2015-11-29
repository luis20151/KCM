/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.PatronesDAO;

import Modelo.PatronesVO.RegistroVO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author josel
 */
public class ModificarTrabajadorDAO {
     public void ModifPac(String codigo)
{
    String sql = "exec sp_modificar "+codigo;
    Modelo.ConnectionDao.getInstance();
    System.out.println("Paciente modificado en el Sistema KCM");
    JOptionPane.showMessageDialog(null,"Cambios Realizados, Registro Guardado ");   
}
    
}

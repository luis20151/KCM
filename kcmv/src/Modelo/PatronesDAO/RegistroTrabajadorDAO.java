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
public class RegistroTrabajadorDAO {
    
    public void RegistroPaciente (String codigo)
{
    String sql = "exec sp_registrar "+codigo;
    Modelo.ConnectionDao.getInstance();
    System.out.println("Regisgtro guardado en el Sistema Vacacional");
    JOptionPane.showMessageDialog(null,"Registro Realizado");
}
}
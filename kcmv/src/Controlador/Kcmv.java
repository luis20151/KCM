/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Singleton.Singleton;
import Vistas.Ventana_Principal;
import java.security.Principal;

/**
 *
 * @author josel
 */
public class Kcmv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
  Singleton single1 = Singleton.getInstance();
  Singleton single2 = Singleton.getInstance();
  System.out.println(single1 == single2);

		Kcmv miPrincipal=new Kcmv();
	miPrincipal.iniciar();
	}

	Ventana_Principal miVentanaPrincipal;
	Coordinador miCoordinador;
 private void iniciar() {
/**Se instancian las clases*/
 miVentanaPrincipal=new Ventana_Principal();
 miCoordinador=new Coordinador();
 
/**Se establecen las relaciones entre clases*/
// miVentanaPrincipal.setCoordinador(miCoordinador);
 
/**Se establecen relaciones con la clase coordinador*/
 miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
     
 miVentanaPrincipal.setVisible(true);
}   

    
    }
    


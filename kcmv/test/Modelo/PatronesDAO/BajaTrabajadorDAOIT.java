
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.PatronesDAO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josel
 */
public class BajaTrabajadorDAOIT {
    
    public BajaTrabajadorDAOIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of eliminarPersona method, of class BajaTrabajadorDAO.
     */
    @Test
    public void testEliminarPersona() {
        System.out.println("eliminarPersona");
        String codigo = "";
        BajaTrabajadorDAO instance = new BajaTrabajadorDAO();
        instance.eliminarPersona(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

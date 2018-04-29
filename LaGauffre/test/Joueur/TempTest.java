/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Model.Coup;
import Model.PlateauGauffre;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Coralie
 */
public class TempTest {
    
    public TempTest() {
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
     * Test of duplique method, of class Temp.
     */
    @Test
    public void testDuplique() {
        System.out.println("duplique");
        PlateauGauffre p = null;
        Temp instance = new Temp();
        PlateauGauffre expResult = null;
        PlateauGauffre result = instance.duplique(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gaufreApresCoup method, of class Temp.
     */
    @Test
    public void testGaufreApresCoup() {
        System.out.println("gaufreApresCoup");
        Coup c = null;
        PlateauGauffre p = null;
        Temp instance = new Temp();
        PlateauGauffre expResult = null;
        PlateauGauffre result = instance.gaufreApresCoup(c, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of coupPossible method, of class Temp.
     */
    @Test
    public void testCoupPossible() {
        System.out.println("coupPossible");
        PlateauGauffre p = null;
        Temp instance = new Temp();
        ArrayList<Noeud> expResult = null;
        ArrayList<Noeud> result = instance.coupPossible(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

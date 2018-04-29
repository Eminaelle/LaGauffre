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
public class IATest {
    
    public IATest() {
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
     * Test of calculCoup method, of class IA.
     */
    @Test
    public void testCalculCoup() {
        System.out.println("calculCoup");
        ArbreCoup a = null;
        PlateauGauffre p = null;
        IA instance = null;
        Coup expResult = null;
        Coup result = instance.calculCoup(a, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of coupGagnant method, of class IA.
     */
    @Test
    public void testCoupGagnant() {
        System.out.println("coupGagnant");
        ArrayList<Noeud> l = null;
        PlateauGauffre p = null;
        IA instance = null;
        Coup expResult = null;
        Coup result = instance.coupGagnant(l, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of coupRandom method, of class IA.
     */
    @Test
    public void testCoupRandom() {
        System.out.println("coupRandom");
        ArbreCoup a = null;
        IA instance = null;
        Coup expResult = null;
        Coup result = instance.coupRandom(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evalA method, of class IA.
     */
    @Test
    public void testEvalA() {
        System.out.println("evalA");
        Noeud n = null;
        PlateauGauffre p = null;
        IA instance = null;
        int expResult = 0;
        int result = instance.evalA(n, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evalB method, of class IA.
     */
    @Test
    public void testEvalB() {
        System.out.println("evalB");
        Noeud n = null;
        PlateauGauffre p = null;
        IA instance = null;
        int expResult = 0;
        int result = instance.evalB(n, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluation method, of class IA.
     */
    @Test
    public void testEvaluation() {
        System.out.println("evaluation");
        PlateauGauffre p = null;
        IA instance = null;
        int expResult = 0;
        int result = instance.evaluation(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

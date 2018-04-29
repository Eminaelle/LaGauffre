/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Model.Coup;
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
public class NoeudTest {
    
    public NoeudTest() {
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
     * Test of affecteFils method, of class Noeud.
     */
    @Test
    public void testAffecteFils() {
        System.out.println("affecteFils");
        ArrayList<Noeud> l = null;
        Noeud instance = null;
        instance.affecteFils(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of coup method, of class Noeud.
     */
    @Test
    public void testCoup() {
        System.out.println("coup");
        Noeud instance = null;
        Coup expResult = null;
        Coup result = instance.coup();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

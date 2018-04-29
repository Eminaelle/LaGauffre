/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

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
public class ArbreCoupTest {
    
    public ArbreCoupTest() {
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
     * Test of fils method, of class ArbreCoup.
     */
    @Test
    public void testFils() {
        System.out.println("fils");
        ArbreCoup instance = null;
        ArrayList<Noeud> expResult = null;
        ArrayList<Noeud> result = instance.fils();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of racine method, of class ArbreCoup.
     */
    @Test
    public void testRacine() {
        System.out.println("racine");
        ArbreCoup instance = null;
        Noeud expResult = null;
        Noeud result = instance.racine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creerListNoeud method, of class ArbreCoup.
     */
    @Test
    public void testCreerListNoeud() {
        System.out.println("creerListNoeud");
        PlateauGauffre p = null;
        int profondeur = 0;
        ArbreCoup instance = null;
        ArrayList<Noeud> expResult = null;
        ArrayList<Noeud> result = instance.creerListNoeud(p, profondeur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class OperationGauffreTests
{
    
    public OperationGauffreTests()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    @Test
    public void creationPlateau()
    {
        PlateauGauffre p = new PlateauGauffre(10,10);
        Coup c = new Coup(5, 2);
        boolean b = OperationGauffre.appliquerCoup(p, c);
        Boolean tab_voulu[][] =         
        {
            { true,true,true,true,true,true,true,true,true,true },
            { true,true,true,true,true,true,true,true,true,true },
            { true,true,true,true,true,false,false,false,false,false },
            { true,true,true,true,true,false,false,false,false,false },
            { true,true,true,true,true,false,false,false,false,false },
            { true,true,true,true,true,false,false,false,false,false },
            { true,true,true,true,true,false,false,false,false,false },
            { true,true,true,true,true,false,false,false,false,false },
            { true,true,true,true,true,false,false,false,false,false },
            { true,true,true,true,true,false,false,false,false,false }        
        };
        Plateau p_voulu = new Plateau(tab_voulu);
        assert p.equals(p_voulu);
    }
    
}

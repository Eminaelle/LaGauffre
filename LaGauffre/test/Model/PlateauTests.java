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
public class PlateauTests
{

    public PlateauTests()
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
        Plateau p1 = new PlateauGauffre(3,3);
        Boolean tab[][] = {{true,true,true},{true,true,true},{true,true,true}};
        Plateau p2 = new PlateauGauffre(tab);
        assert p1.equals(p2);
    }
    
}

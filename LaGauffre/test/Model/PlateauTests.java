/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Data.PlateauGaufre;
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
    public void creationPlateauTest()
    {
        PlateauGaufre p1 = new PlateauGaufre(3,4);
        boolean tab[][] = {
            {true,true,true},
            {true,true,true},
            {true,true,true},
            {true,true,true}};
        PlateauGaufre p2 = new PlateauGaufre(tab);
        assert p1.equals(p2);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Data.PlateauGaufre;
import java.util.ArrayList;
import java.util.Arrays;
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
<<<<<<< HEAD
    public void creationPlateau()
    {
        PlateauGauffre p = new PlateauGauffre(10,10);
        Coup c = new Coup(5, 2);
        boolean b = OperationGauffre.appliquerCoup(p, c);
        Boolean tab_voulu[][] =
=======
    public void appliquerCoupTest()
    {
        PlateauGaufre p = new PlateauGaufre(10,10);
        Coup c = new Coup(5, 2);
        boolean b = OperationGaufre.appliquerCoup(p, c);
        boolean tab_voulu[][] =
>>>>>>> Moteur
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
<<<<<<< HEAD
        Plateau p_voulu = new Plateau(tab_voulu);
=======
        PlateauGaufre p_voulu = new PlateauGaufre(tab_voulu);
        assert p.equals(p_voulu);
    }

    @Test
    public void appliquerCoupsTest()
    {
        PlateauGaufre p = new PlateauGaufre(10,10);

        Coup[] c = { new Coup(4, 9), new Coup(6, 6), new Coup(7, 2) };

        ArrayList<Coup> coups = new ArrayList(Arrays.asList(c));

        boolean b = OperationGaufre.appliquerCoups(p, coups);
        boolean tab_voulu[][] =
        {
            { true,true,true,true,true,true,true,true,true,true },
            { true,true,true,true,true,true,true,true,true,true },
            { true,true,true,true,true,true,true,false,false,false },
            { true,true,true,true,true,true,true,false,false,false },
            { true,true,true,true,true,true,true,false,false,false },
            { true,true,true,true,true,true,true,false,false,false },
            { true,true,true,true,true,true,false,false,false,false },
            { true,true,true,true,true,true,false,false,false,false },
            { true,true,true,true,true,true,false,false,false,false },
            { true,true,true,true,false,false,false,false,false,false }
        };
        PlateauGaufre p_voulu = new PlateauGaufre(tab_voulu);
        assert p.equals(p_voulu);
    }

    @Test
    public void TODO()
    {
        PlateauGaufre p = new PlateauGaufre(10,10);
        Coup c = new Coup(5, 2);
        boolean b = OperationGaufre.appliquerCoup(p, c);
        boolean tab_voulu[][] =
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

        PlateauGaufre p_voulu = new PlateauGaufre(tab_voulu);
>>>>>>> Moteur
        assert p.equals(p_voulu);
    }

}

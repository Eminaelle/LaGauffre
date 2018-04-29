/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Data.PlateauGaufre;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Thomas
 */
public class OperationGaufre
{
    static boolean appliquerCoup(PlateauGaufre p, Coup c)
    {
        if(!p.getAt(c.x, c.y))
            return false;
        for(int x = c.x; x < p.getLargeur(); ++x)
        {
            for(int y = c.y; y < p.getHauteur(); ++y)
            {
                p.setAt(x, y, false);
            }
        }
        return true;
    }
    
    static boolean appliquerCoups(PlateauGaufre p, Collection<Coup> col)
    {
        boolean res = true;
        for(Coup c : col)
        {
            if(!appliquerCoup(p, c))
                res = false;
        }
        return res;
    }
    
    static PlateauGaufre GaufreApresCoup(PlateauGaufre p, Coup c)
    {
        PlateauGaufre papres = new PlateauGaufre(p);
        appliquerCoup(papres, c);
        return papres;
    }
    
    static PlateauGaufre GaufreApresCoups(PlateauGaufre p, Collection<Coup> col)
    {
        PlateauGaufre papres = new PlateauGaufre(p);
        appliquerCoups(papres, col);
        return papres;
    }
    
    static ArrayList<Coup> coupsPossibles(PlateauGaufre p)
    {
        ArrayList<Coup> coupsPossibles = new ArrayList<>();
        for(int y = 0; y < p.getHauteur(); ++y)
        {
            for(int x = 0; x < p.getLargeur(); ++x)
            {
                if(p.getAt(x, y))
                {
                    coupsPossibles.add(new Coup(x, y));
                }
            }
        }
        return coupsPossibles;
    }
}

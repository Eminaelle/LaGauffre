/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lucas
 */
public class OperationGauffre
{
    static boolean appliquerCoup(PlateauGauffre p, Coup c)
    {
        if(!p.at(c))
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
}

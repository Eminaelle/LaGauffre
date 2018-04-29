/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Stack;
import Model.Data.PlateauGaufre;

/**
 *
 * @author Thomas
 */
public class TracePartie
{
    public PlateauGaufre gaufre;
    public Stack<Coup> coups;
    
    public TracePartie(PlateauGaufre gaufre, Stack<Coup> coups)
    {
        this.gaufre = gaufre;
        this.coups = coups;
    }
    
}

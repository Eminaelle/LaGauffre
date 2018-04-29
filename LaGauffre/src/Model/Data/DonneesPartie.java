/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Data;

import java.util.ArrayList;
import Model.Joueur;
import p.util.Position;

/**
 *
 * @author Thomas
 */
public class DonneesPartie
{
    public final ArrayList<DonneesJoueur> joueurs;
    public final PlateauGaufre gaufre;
    
    public DonneesPartie(ArrayList<DonneesJoueur> joueurs, Position dim)
    {
        this(joueurs, new PlateauGaufre(dim.x, dim.y));
    }
    
    public DonneesPartie(ArrayList<DonneesJoueur> joueurs, PlateauGaufre gaufre)
    {
        this.joueurs = joueurs;
        this.gaufre = gaufre;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;
import Model.Coup;
import Model.PlateauGaufre;
import java.util.ArrayList;
/**
 *
 * @author Coralie
 */
public class JoueurIA extends Joueur{
    PlateauGaufre p;
    IA intellecte;
    
   
    public JoueurIA(IA intellecte, String nom, int score) {
        super(nom, score);
        this.intellecte = intellecte;
    }
    
    @Override
    public Coup jouer(){
        ArbreCoup a;
        a = new ArbreCoup(new Noeud (new Coup(-1,-1),null));
        ArrayList<Noeud> noeud;
        noeud = a.creerListNoeud(p, 3);
        a.racine().affecteFils(noeud);
        return intellecte.calculCoup(a, p);
    }
    
    
}

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


public class ArbreCoup {
    Noeud n;
    
    public ArbreCoup(Noeud n) {
        this.n = n;
    }
    
    public ArrayList<Noeud> fils(){
        return n.fils;
    }
    public Noeud racine(){
        return n;
    }
   
    
    public ArrayList<Noeud> creerListNoeud(PlateauGaufre p, int profondeur){
        ArrayList<Noeud> l = new ArrayList<>();
        ArrayList<Noeud> listeCoup;
        Temp t = new Temp();
        Coup c;
        Noeud noeudTmp;
        listeCoup = t.coupPossible(p);
        while(!listeCoup.isEmpty()){
            noeudTmp = listeCoup.remove(0);
            c = noeudTmp.coup();
            if(profondeur == 0 || p.at(0,0)==false){
                l.add(new Noeud( c , null));
            }
            else{
                l.add(new Noeud(c , creerListNoeud(t.gaufreApresCoup(c , p), profondeur--)));
            }
        }
        return l;
 
    }
 
}

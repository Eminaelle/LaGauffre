/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;
package Model;

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
        Coup c;
        Noeud noeudTmp;
        listeCoup = coupPossible(PlateauGaufre p);
        while(!listeCoup.isEmpty()){
            noeudTmp = listeCoup.remove(0);
            c = noeudTmp.c;
            if(profondeur == 0 || p.getAt(0,0)==false){
                l.add(new Noeud( c , null));
            }
            else{
                l.add(new Noeud(c , creerListNoeud(gaufreApresCoup(c , p), profondeur--)));
            }
        }
        return l;
 
    }
 
}

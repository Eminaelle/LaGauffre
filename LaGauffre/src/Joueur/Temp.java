/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Model.Coup;
import Model.Plateau;
import Model.PlateauGauffre;
import java.util.ArrayList;

/**
 *
 * @author Coralie
 */
class Temp {
    
    
    
    public PlateauGauffre duplique(PlateauGauffre p){
        if(p == null){
            return null;
        }
        PlateauGauffre p2;
        Boolean[][] newtab = new Boolean[p.getLargeur()][p.getHauteur()];
        for(int i=0; i< p.getLargeur();i++){
            for(int j=0;j<p.getHauteur();j++){
                newtab[i][j]=p.at(i,j);
            }
        }
        p2 = new PlateauGauffre(newtab);
        return p2;
    }
    
    public PlateauGauffre gaufreApresCoup(Coup c, PlateauGauffre p){
        if(p == null || c == null){
            return null;
        }
        PlateauGauffre p2 = duplique(p);
        p2.appliquerCoup(c);
        return p2;
    }
    
    public ArrayList<Noeud> coupPossible(PlateauGauffre p){
        if(p == null){
            return null;
        }
        else{
            ArrayList<Noeud> coupPos = new ArrayList<>();
            for(int i=0; i< p.getLargeur();i++){
                for(int j=0;j<p.getHauteur();j++){
                    if(p.at(i,j)){
                        coupPos.add(new Noeud(new Coup(i,j),null));
                    }
                }
            }

            return coupPos;
        }
    }
}

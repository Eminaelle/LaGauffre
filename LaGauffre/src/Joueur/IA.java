/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Model.Coup;
import Model.PlateauGaufre;
import static java.lang.Integer.max;
import static java.lang.Integer.min;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Coralie
 */
public class IA {
    Difficulte d;

    public IA(Difficulte d) {
        this.d = d;
    }
    
    Coup calculCoup(ArbreCoup a, PlateauGaufre p){
        Coup cMax;
        ArrayList<Noeud> l = a.fils();
 
        switch (d) 
        {
            case DIFFICILE :
                cMax = coupGagnant( l, p);
                break;
            case MOYEN :
                Random rnd = new Random();
                if(rnd.nextInt(2)==0){
                    cMax = coupRandom(a);
                }
                else{
                    cMax = coupGagnant( l, p);
                }
                break;
            default :
                cMax = coupRandom(a);
                break;
        }
        return cMax;
    }
    public Coup coupGagnant(ArrayList<Noeud> l, PlateauGaufre p){
        Coup cMax = new Coup(-1,-1);
        int vMax = -1;
        int tmp;
        Noeud noeudTmp;
        while(!l.isEmpty()){
            noeudTmp = l.remove(0);
            tmp = evalB(noeudTmp, p);
            if(tmp > vMax){
                vMax = tmp;
                cMax = noeudTmp.c;
            }
        }
        return cMax;
    }
    
    public Coup coupRandom(ArbreCoup a){
        int taille = a.fils().size();
        Coup cMax = new Coup(-1,-1);
        Random rnd = new Random();
        do{
            cMax = a.fils().get(rnd.nextInt(taille)).c; 
        }while(cMax.x == 0 && cMax.y == 0);
        return cMax;
    }
    
    public int evalA(Noeud n, PlateauGaufre p){
        Temp t = new Temp();
        PlateauGaufre apresGaufre= t.gaufreApresCoup(p,n.c);
        if(n.fils==null){
            return evaluation(apresGaufre);
        }
        else{
            int vMax =-1;
            ArrayList<Noeud> l = n.fils;
            int tmp;
            while(!l.isEmpty()){
                tmp=evalB(n,apresGaufre);
                vMax = max(tmp,vMax);
            }
            return vMax;
            
        }
        
    }
    
    public int evalB(Noeud n, PlateauGaufre p){
        Temp t = new Temp();
        PlateauGaufre apresGaufre= t.gaufreApresCoup(p,n.c);
        if(n.fils==null){
            return evaluation(apresGaufre);
        }
        else{
            int vMin =200;
            ArrayList<Noeud> l = n.fils;
            int tmp;
            while(!l.isEmpty()){
                tmp=evalB(n,apresGaufre);
                vMin = min(tmp,vMin);
            }
            return vMin;
            
        }
        
    }
    
    public int evaluation(PlateauGaufre p){
        int m=0, n=0, i=0;
        boolean diag = p.at(1,1);
        while(i<p.getLargeur() && m==0){
            if(!p.at(i,0)){
                m=i;
            }
        }
        if(i==p.getLargeur())
            m=i;
        i=0;
        while(i<p.getHauteur() && n==0){
            if(!p.at(i,0)){
                n=i;
            }
        }
        if(i==p.getHauteur())
            n=i;
        
        if(m==n && !diag){
            return 100;
        }
        else if(m!=n && diag){
            return 75;
        }
        else if(m==n && diag || m!=n && !diag){
            return 0;
        }
        else
            return 50;
    }
}

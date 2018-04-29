/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Model.Coup;
import java.util.ArrayList;

/**
 *
 * @author Coralie
 */
public class Noeud {
        Coup c;
        ArrayList<Noeud> fils;

        public Noeud(Coup c, ArrayList<Noeud> fils) {
            this.c = c;
            this.fils = fils;
        }  
        public void affecteFils(ArrayList<Noeud> l){
            fils = l;
        }
        public Coup coup(){
            return c;
        }
    }
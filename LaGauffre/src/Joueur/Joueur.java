/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Model.Coup;

/**
 *
 * @author Coralie
 */
abstract class Joueur {
    String nom;
    Integer score;
    
    Joueur(String nom, int score){
        this.nom = nom;
        this.score = score;
    }
    
    abstract Coup jouer();
}

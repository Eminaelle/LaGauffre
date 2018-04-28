/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

/**
 *
 * @author Coralie
 */
public enum Difficulte {
    FACILE(0), MOYEN(1), DIFFICILE(2);
    int difficulte;

    private Difficulte(int difficulte) {
        this.difficulte = difficulte;
    }
    
}

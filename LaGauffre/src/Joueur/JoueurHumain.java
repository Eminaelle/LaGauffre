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
public class JoueurHumain extends Joueur{
  
    public JoueurHumain(String nom, int score) {
        super(nom, score);
    }
    
    @Override
    
    public Coup jouer(){
        return waitForEvent(); //attente clic souris
    }
    
}

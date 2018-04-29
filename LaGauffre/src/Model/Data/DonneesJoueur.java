/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Data;

/**
 *
 * @author Thomas
 */
public class DonneesJoueur
{
    public final String nom;
    public final int score;
    
    DonneesJoueur(String nom)
    {
        this(nom, 0);
    }
    
    DonneesJoueur(String nom, int score)
    {
        this.nom = nom;
        this.score = 0;
    }
            
}

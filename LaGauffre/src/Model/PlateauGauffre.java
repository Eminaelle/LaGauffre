/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class PlateauGauffre extends Plateau<Boolean>
{

    /**
     * Crée un plateau de 15x15
     */
    PlateauGauffre() throws CloneNotSupportedException
    {
        this(15, 15);
    }

    /**
     *
     * @param plateau
     */
    PlateauGauffre(Boolean plateau[][])
    {
        super(plateau);
    }

    /**
     * hauteur et largeur >= 1
     *
     * @param hauteur
     * @param largeur
     */
    PlateauGauffre(int largeur, int hauteur)
    {
        this(new Boolean[largeur][hauteur]);
        for (int x = 0; x < getLargeur(); x++)
        {
            for (int y = 0; y < getHauteur(); y++)
            {
                setAt(x, y, true);
            }
        }
    }

    /**
     * Retourne vrai si le coup a bien été appliqué, false si le coup n'a pas eu
     * d'effet sur la gauffre
     *
     * @param c
     * @return
     */
    public boolean appliquerCoup(Coup c)
    {
        //maj du plateau en fonction du coup

        return false;
    }
}

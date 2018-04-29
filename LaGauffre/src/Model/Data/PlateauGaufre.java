/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Data;

import p.util.BooleanWrapper;
import p.util.Matrix;

/**
 *
 * @author lucas
 */
public class PlateauGaufre extends Object
{
    private Matrix<BooleanWrapper> p;
    
    /**
     * Crée un plateau de 15x15
     */
    public PlateauGaufre()
    {
        this(15, 15);
    }
    
    public PlateauGaufre(PlateauGaufre pg)
    {
        p = new Matrix<>(pg.p);
    }
    
    public PlateauGaufre(boolean[][] datab)
    {
        BooleanWrapper[][] data = new BooleanWrapper[datab.length][datab[0].length];
        for(int y = 0; y < datab.length; ++y)
        {
            for(int x = 0; x < datab[0].length; ++x)
            {
                data[y][x] = new BooleanWrapper(datab[y][x]);
            }
        }
        p = new Matrix<>(data);
    }

    /**
     * hauteur et largeur >= 1
     *
     * @param hauteur
     * @param largeur
     */
    public PlateauGaufre(int largeur, int hauteur)
    {
        BooleanWrapper[][] tab = new BooleanWrapper[hauteur][largeur];
        for (int y = 0; y < hauteur; y++)
        {
            for (int x = 0; x < largeur; x++)
            {
                tab[y][x] = new BooleanWrapper(true);
            }
        }
        p = new Matrix<>(tab);
    }
    
    public boolean getAt(int x, int y)
    {
        return p.getAt(x, y).b;
    }
    
    public void setAt(int x, int y, boolean b)
    {
        p.setAt(x, y, new BooleanWrapper(b));
    }
    
    public boolean estMangee()
    {
        return !getAt(0, 0);
    }
    
    public int getLargeur()
    {
        return p.sizeX();
    }
    
    public int getHauteur()
    {
        return p.sizeY();
    }
    
    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof PlateauGaufre))
            return false;
        PlateauGaufre otherMyClass = (PlateauGaufre)other;
        return otherMyClass.p.equals(p);
    }
}
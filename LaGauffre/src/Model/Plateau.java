/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Plateau<T> extends Object
{

    private T plateau[][];

    Plateau(T plateau[][])
    {
        this.plateau = plateau;
    }

    public T at(int x, int y)
    {
        return plateau[x][y];
    }

    public T at(Position p)
    {
        return at(p.x, p.y);
    }
    
    protected void setAt(int x, int y, T t)
    {
        plateau[x][y] = t;
    }

    public int getHauteur()
    {
        return plateau[0].length;
    }

    public int getLargeur()
    {
        return plateau.length;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }
        if (other == this)
        {
            return true;
        }
        if (!(other instanceof Plateau))
        {
            return false;
        }
        Plateau otherMyClass = (Plateau) other;
        for (int x = 0; x < getLargeur(); x++)
        {
            for (int y = 0; y < getHauteur(); y++)
            {
                if (!otherMyClass.at(x, y).equals(at(x, y)))
                {
                    return false;
                }
            }
        }
        return true;
    }

    Plateau<T> copy()
    {
        return new Plateau<>(plateau.clone());
    }

}

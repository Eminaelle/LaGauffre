/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lucas
 */
public class Position extends Object
{
    public int x;
    public int y;

    public Position()
    {
        this(0,0);
    }
    
    public Position(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    
    @Override
    public boolean equals(Object other)
    {
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof Plateau)) return false;
        Position otherMyClass = (Position)other;
        if(otherMyClass.x != x || otherMyClass.y != y) return false;
        return true;
    }
    
    public Position copy()
    {
        return new Position(x, y);
    }
}

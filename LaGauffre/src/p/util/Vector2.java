/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.util;

/**
 *
 * @author lucas
 */
public class Vector2<T> extends Object
{
    public T x;
    public T y;
    
    public Vector2(Vector2<T> p)
    {
        this(p.x, p.y);
    }
    
    public Vector2(T x, T y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Vector2))
            return false;
        Vector2 otherMyClass =(Vector2)other;
        return !(otherMyClass.x != x || otherMyClass.y != y);
    }
}

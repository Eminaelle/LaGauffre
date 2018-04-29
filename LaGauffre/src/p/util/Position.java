/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.util;

/**
 *
 * @author Thomas
 */
public class Position extends Vector2<Integer>
{
    public Position()
    {
        this(0, 0);
    }
    
    public Position(Position p)
    {
        super(p);
    }
    
    public Position(int x, int y)
    {
        super(x, y);
    }
}

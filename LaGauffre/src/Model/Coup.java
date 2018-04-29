/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import p.util.Position;

/**
 *
 * @author lucas
 */
public class Coup extends Position
{
    public Coup(Coup c)
    {
        this(c.x, c.y);
    }

    public Coup(int x, int y)
    {
        super(x, y);
    }
}

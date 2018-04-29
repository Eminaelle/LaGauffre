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
public class BooleanWrapper extends Object
{
    public boolean b;
    
    public BooleanWrapper(boolean b)
    {
        this.b = b;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof BooleanWrapper))
            return false;
        BooleanWrapper otherMyClass = (BooleanWrapper)other;
        return otherMyClass.b == b;
    }
}
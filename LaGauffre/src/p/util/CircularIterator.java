/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.util;

import java.util.Collection;
import java.util.Iterator;

public class CircularIterator<E> implements Iterator
{
    Collection<E> c;
    Iterator<E> current;
    
    public CircularIterator(Collection c)
    {
        this.c = c;
        this.current = c.iterator();
    }
    
    @Override
    public boolean hasNext()
    {
        return c.iterator().hasNext();
    }
    
    @Override
    public E next()
    {
        if(!current.hasNext())
           current = c.iterator();
        return current.next();
    }
}

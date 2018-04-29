/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.util;

public class Matrix<E> extends Object
{
    private final Object[][] data;
    
    public Matrix(Matrix m)
    {
        data = new Object[m.sizeY()][m.sizeX()];
        for (int i = 0; i < data.length; i++)
            data[i] = m.data[i].clone();
    }
    
    public Matrix(E[][] data)
    {
        this.data = data;
    }

    public E getAt(int x, int y)
    {
        return (E) data[y][x];
    }
    
    public void setAt(int x, int y, E e)
    {
        data[y][x] = (Object) e;
    }
    
    public int sizeX()
    {
        return data[0].length;
    }
    
    public int sizeY()
    {
        return data.length;
    }
    
    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Matrix))
            return false;
        Matrix otherMyClass = (Matrix) other;
        for (int y = 0; y < sizeY(); y++)
            for (int x = 0; x < sizeX(); x++)
                if (!otherMyClass.data[y][x].equals(data[y][x]))
                    return false;
        return true;
    }
}

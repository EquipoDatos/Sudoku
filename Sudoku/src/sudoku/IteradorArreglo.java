/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author alberto
 */
public class IteradorArreglo <T> implements Iterator<T> {
    private T[] coleccion;
    private int actual; /*Casilla en la que estoy parado*/
    private int total;
    
    public IteradorArreglo(T[] coleccion, int total){
        this.coleccion=coleccion;
        this.total=total;
        this.actual=0;
    }
    
    public boolean hasNext(){
        return actual<total;
    }
    
    public T next(){
        if(!hasNext())
            throw new NoSuchElementException();
        T result;
        result=coleccion[actual];
        actual++;
        return result;
    }
    
    public void remove(){
        throw new UnsupportedOperationException("No está implementado");
    }
}


package sudoku;

import java.util.Iterator;

/**
 *
 * @author Marco Palermo
 * @author Alberto Jafif
 * @author Abraham Attie
 * @author David Ramos
 */
public class ConjuntoA <T> implements ConjuntoADT <T>{
    private T[] conjunto;
    private int cardinalidad;
    private final int MAX=20;
    
    public ConjuntoA(){
        conjunto =(T[]) new Object[MAX];
        cardinalidad = 0;
    }
    
    public ConjuntoA(int tamano){
        conjunto =(T[]) new Object[tamano];
        cardinalidad = 0;
    }
    
    @Override
    public Iterator <T> iterator(){
        return new IteradorArreglo(conjunto, cardinalidad);
    }
    
    @Override
    public boolean contiene(T elemento){
        boolean resp = false;
        Iterator <T> it = iterator();
        while (it.hasNext() && !resp)
            resp = it.next().equals(elemento);
        return resp;
    }
    
    @Override
    public boolean agrega(T elemento){
        boolean resp;
        if(elemento != null && !contiene(elemento)){
            if(cardinalidad == conjunto.length)
                expande();
            conjunto[cardinalidad] = elemento;
            cardinalidad++;
            resp = true;
        }
        else
            resp = false;
        return resp;
    }
    
    private void expande(){
        T[] nuevo = (T[])new Object[conjunto.length*2];
        for(int i=0; i<cardinalidad; i++)
            nuevo[i]=conjunto[i];
        conjunto=nuevo;
    }
    
    @Override
    public String toString(){
        return toString(0, new StringBuilder());
    }
    
    private String toString(int i, StringBuilder cad){
        if(cardinalidad == 1)
            return ("["+conjunto[0]+"]");
        if(i == cardinalidad)
            return cad.toString();
        else{
            if(i==0){
                cad.append("[").append(conjunto[i]).append(", ");
                return toString(i+1, cad);
            }
            else if(i==cardinalidad-1){
                cad.append(conjunto[i]).append("]");
                return toString(i+1, cad);
            }
            else{
                cad.append(conjunto[i]).append(", ");
                return toString(i+1, cad);
            }
        }
    }
    
    public int getCardinality(){
        return cardinalidad;
    }
    @Override
    public T quita(T elemento){
        T resp = null;
        if(elemento != null){
            int pos;
            pos = busca(elemento, 0);
            if(pos>=0){
                resp = conjunto[pos];
                conjunto[pos] = conjunto[cardinalidad-1];
                conjunto[cardinalidad-1] = null;
                cardinalidad--;
            }
        }
        return resp;   
    }
    
    private int busca(T elemento, int i){
        if(i == cardinalidad)
            return -1;
        else
            if(conjunto[i].equals(elemento))
                return i;
            else
                return busca(elemento, i+1);
    }
    
    @Override
    public boolean isEmpty(){
        return cardinalidad == 0;
    }
    
    @Override
    public ConjuntoADT <T> union(ConjuntoADT <T> otro){
        if (otro == null)
            throw new NullPointerException("Conjunto vacío");
        ConjuntoA <T> nuevo = new ConjuntoA(cardinalidad);
        System.arraycopy(this.conjunto, 0, nuevo.conjunto, 0, cardinalidad);
        nuevo.cardinalidad=cardinalidad;
        Iterator<T> it = otro.iterator();
        while(it.hasNext())
                nuevo.agrega(it.next());
        return nuevo;
    }
    
    public ConjuntoADT <T> interseccion(ConjuntoADT <T> otro){
        if (otro == null)
            throw new NullPointerException("Conjunto vacío");
        T dato;
        ConjuntoA <T> nuevo = new ConjuntoA(cardinalidad);
        Iterator<T> it = otro.iterator();
        int j=0;
        for(int i=0; i<cardinalidad; i++)
            if(otro.contiene(conjunto[i])){
                nuevo.conjunto[j]=conjunto[i];
                j++;
            }
        nuevo.cardinalidad=j;
        return nuevo;
    }
    
    public ConjuntoADT <T> diferencia(ConjuntoADT <T> otro){
        if (otro == null)
            throw new NullPointerException("Conjunto vacío");
        T dato;
        ConjuntoA <T> nuevo = new ConjuntoA(cardinalidad);
        int j=0;
        for(int i=0; i<cardinalidad; i++){
            dato=conjunto[i];
            if(!otro.contiene(dato)){
                nuevo.conjunto[j]=dato;
                j++;
            }
        }
        nuevo.cardinalidad=j;
        return nuevo;
        }
    
    private boolean equals(ConjuntoADT<T> otro, int elemento){
        if(elemento==cardinalidad)
            return true;
        else
            if(otro.contiene(conjunto[elemento]))
                return equals(otro, elemento+1);
            else
                return false;
    }
    
    public boolean equals(ConjuntoADT<T> otro){
        boolean resp = false;
        if(otro.isEmpty())
            throw new RuntimeException("Conjunto vacío");
        if(cardinalidad == otro.getCardinality())
            resp = equals(otro,  0);
        return resp;
    }
}

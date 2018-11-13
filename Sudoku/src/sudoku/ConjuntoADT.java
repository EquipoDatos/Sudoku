
package sudoku;

import java.util.Iterator;

/**
 *
 * @author Marco Palermo
 * @author Alberto Jafif
 * @author Abraham Attie
 * @author David Ramos
 */
public interface ConjuntoADT <T> extends Iterable <T> {
    public boolean contiene(T dato);
    public boolean isEmpty();
    public int getCardinality(); /*Número de elmentos*/
    @Override
    public String toString();
    public ConjuntoADT<T> union(ConjuntoADT<T> otro);
    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otro);
    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otro);
    @Override
    public Iterator <T> iterator();
    public boolean agrega(T elemento);
    public T quita(T elemento);
    public boolean equals(ConjuntoADT<T> otro);
}


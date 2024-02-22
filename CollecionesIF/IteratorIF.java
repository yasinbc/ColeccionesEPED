
/** Representa un iterador de elementos */

public interface IteratorIF<E>
{
    /** Obtiene el siguiente elemento de la iteración
     * @pre: hasNext();
       @return: el siguiente elemento de la iteración */
    public E getNext();
    
    /**Comprueba so aún quedan elementos por iterar.
     * @return: true sii el iterador dispone de más elementos. */
    public boolean hasNext();
    
    /**Vuelve a posicionar el iterador al principio. Esto
     * permite reutilizar un iterador sin crear otro nuevo. */
    public void reset();
}

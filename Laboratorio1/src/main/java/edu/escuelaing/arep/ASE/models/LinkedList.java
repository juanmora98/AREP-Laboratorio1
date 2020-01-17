package edu.escuelaing.arep.ASE.models;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Clase de una linkedlist
public class LinkedList<T> implements List<T> {

    //Atributos
    private Head<T> head;
    private int size;

    public LinkedList(){
        head = new Head<T>(null,null);
        size = 0;
    }

    /*
        Metodo encargado de agregar un nuevo dato a la linked list,
        se creara un Nodo con el dato dado,
        si la lista esta vacia se agregara el nodo a la head como punto inicial y como punto final,
        si la lista ya tiene uno o mas datos, se agregara el nodo a la conexion del ultimo nodo en el head y luego se remplazara en el head.
        @param e dato a agregar
        @return true al completar el proceso

    */
    public boolean add(T e) {
        Node<T> nodo = new Node<T>(e,null);
        if(size == 0){
            this.head.AddPrimerDato(nodo);
            this.head.AddUltimoDato(nodo);
        }
        else{
            this.head.AddUltimoDato(nodo);
        }
        size ++;
        return true;
    }

    public void add(int index,  T element) {
        // TODO Auto-generated method stub

    }

    public boolean addAll( Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean addAll(int index, final Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public void clear() {
        // TODO Auto-generated method stub

    }

    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public T get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public T remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean removeAll(final Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean retainAll(final Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public T set(int index, Object element) {
        // TODO Auto-generated method stub
        return null;
    }

    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    public T[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

}

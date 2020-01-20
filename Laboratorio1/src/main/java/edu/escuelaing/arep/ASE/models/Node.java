package edu.escuelaing.arep.ASE.models;

// Clase de la cabeza representativa de una linked list
public class Node<T>
{

    //Atributos
    private T dato;
    private Node<T> siguienteNodo;

    public Node(T dato, Node<T> siguienteNodo){
        this.dato = dato;
        this.siguienteNodo = siguienteNodo;
    }

    public void setSiguienteNodo(Node<T> nodo){
        this.siguienteNodo = nodo;
    }
    
    public T getDato(){
        return dato;
    }

    public Node<T> getSiguienteNodo(){
        return siguienteNodo;
    }

    

}
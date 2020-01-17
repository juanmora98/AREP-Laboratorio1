package edu.escuelaing.arep.ASE.models;

// Clase de la cabeza representativa de una linked list
public class Head<T>
{
    //Atributos
    private Node<T> primerDato;
    private Node<T> ultimoDato;

    public Head(Node<T> primerDt, Node<T> ultimoDt){
        this.primerDato = primerDt;
        this.ultimoDato = ultimoDt;
    }

    public void AddPrimerDato(Node<T> nodo){
        this.primerDato = nodo;
    }

    public void AddUltimoDato(Node<T> nodo){
        ultimoDato.setSiguienteNodo(nodo);
        this.ultimoDato = nodo;
    }

    public Node<T> getPrimerAtributo(){
        return primerDato;
    }

    public Node<T> getUltimoAtributo(){
        return ultimoDato;
    }

}
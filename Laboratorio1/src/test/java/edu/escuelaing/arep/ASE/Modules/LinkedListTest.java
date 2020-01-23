package edu.escuelaing.arep.ASE.Modules;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.escuelaing.arep.ASE.models.LinkedList;


public class LinkedListTest{
    /**
     * Prueba realizada para comprobar si esta agregando adecuadamente un valor a la lista
     */
    @Test
    public void TestAdd1(){
        int valorPrueba = 34;
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(valorPrueba);
        assertTrue(lista.get(0) == valorPrueba);
    }

    /**
     * Prueba realizada para comprobar si esta agregando adecuadamente un valor a la lista en una posicion especifica
     */
    @Test
    public void TestAdd2(){
        int valorPrueba1 = 34;
        int valorPrueba2 = 35;
        int valorPrueba3 = 37;
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(valorPrueba1);
        lista.add(valorPrueba2);
        lista.add(valorPrueba3);
        int valorConfirmar = 36;
        lista.add(2, valorConfirmar);
        assertTrue(lista.get(2) == valorConfirmar);
    }

    
}

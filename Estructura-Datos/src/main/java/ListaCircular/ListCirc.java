/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaCircular;

import Semana03.Persona;
import Semana03.node;

/**
 *
 * @author usuario
 */
public class ListCirc {

    private node<Persona> head;
    private node<Persona> tail;

    public void insertar(Persona value) {
        node<Persona> nuevoNodo = new node<Persona>(value);
        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);
        } else if (head.getValue().getId() > nuevoNodo.getValue().getId()) {

            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);

        } else if (tail.getValue().getId() <= nuevoNodo.getValue().getId() && head.getNext() == null) {
            node<Persona> aux = nuevoNodo;
            tail.setNext(aux);
            tail = nuevoNodo;
            tail.setNext(head);
        } else {
            node<Persona> aux = tail;
            while (aux.getNext().getValue().getId() < nuevoNodo.getValue().getId()) {
                aux = aux.getNext();
            }

            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void imprimir() {
        node<Persona> aux = head;
        while (aux != tail){
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
            
        }
        System.out.println(tail.getValue().toString());
    }
}

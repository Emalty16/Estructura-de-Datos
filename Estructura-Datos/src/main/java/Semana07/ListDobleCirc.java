/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07;

import Semana03.node;

public class ListDobleCirc {

    private node<Persona> head;
    private node<Persona> tail;

    public void insertar(Persona value) {
        node<Persona> nuevoNodo = new node<Persona>(value);
        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setBack(tail);
        } else if (head.getValue().getId() > nuevoNodo.getValue().getId()) {

            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);
            head.setBack(tail);

        } else if (tail.getValue().getId() <= nuevoNodo.getValue().getId()) {
            nuevoNodo.setBack(tail);
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);
            head.setBack(tail);
        } else {
            node<Persona> aux = head;
            while (aux.getNext().getValue().getId() < nuevoNodo.getValue().getId()) {
                aux = aux.getNext();
            }

            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
            nuevoNodo.setBack(aux);

            aux.getNext().setBack(nuevoNodo);
            nuevoNodo.setBack(aux);
        }
    }

    public void imprimir() {
        node<Persona> aux = head;
        while (aux != tail) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();

        }
        System.out.println(tail.getValue().toString());
    }

    public boolean existe(int d) {
        node aux = head;
        while ((aux.getNext() != head) && (!(aux.getValue().equals(d)))) {
            aux = aux.getNext();
        }
        return aux.getValue().equals(d);
    }

    public void modifica(Persona p) {

    }

    public void elimina(int id) {
        boolean result = true;
        if (head == null) {
            return;
        } else if (id < head.getValue().getId()) {
            return;
        } else if (head.getValue().getId() == id) {
            head = head.getNext();
            head.setBack(null);
        } else {
            node aux = head;
            aux = aux.getNext();
        /*if (aux.getNext() == id) {
            aux.getBack().setNext(aux.getNext());
            if (aux.getNext() != null) {
                aux.getNext().setBack(aux.getBack());
            }
        }
    }

    return result ;*/
}

/*public void extrae(int id){
        Persona p = null;
        
        
        return p;
    }*/
    }
}

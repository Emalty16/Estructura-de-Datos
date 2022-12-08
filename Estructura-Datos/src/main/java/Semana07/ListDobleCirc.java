/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07;

public class ListDobleCirc {

    private Nodo head;
    private Nodo tail;

    public void insertar(Persona value) {
        Nodo nuevoNodo = new Nodo();
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
            Nodo aux = head;
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
        Nodo aux = head;
        while (aux != tail) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();

        }
        System.out.println(tail.getValue().toString());
    }

    public boolean existe(int d) {
        Nodo aux = head;
        while ((aux.getNext() != head) && (!(aux.getValue().equals(d)))) {
            aux = aux.getNext();
        }
        return aux.getValue().equals(d);
    }

    public void modifica(Persona p) {

    }

    public void eliminaValor(Persona valor) {
        if (head != null) {
            Nodo aux = head;
            Nodo ant = null;
            while (aux != null) {
                if (aux.getValue() == valor) {
                    if (ant == null) {
                        head = head.getNext();
                        aux.setNext(null);
                        aux = head;

                    } else {
                        ant.setNext(aux.getNext());
                        aux.setNext(null);
                        aux = ant.getNext();
                    }
                } else {
                    ant = aux;
                    aux = aux.getNext();
                }
            }
        }

    }

    /*public void extrae(int id){
        Persona p = null;
        
        
        return p;
    }*/
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07;

/**
 *
 * @author usuario
 */
public class ListCirc {

    private Nodo head;
    private Nodo tail;

    public void insertar(Persona value) {
        Nodo nuevoNodo = new Nodo();
        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);
        } else if (head.getValue().getId() > nuevoNodo.getValue().getId()) {

            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);

        } else if (tail.getValue().getId() <= nuevoNodo.getValue().getId() && head.getNext() == null) {
            Nodo aux = nuevoNodo;
            tail.setNext(aux);
            tail = nuevoNodo;
            tail.setNext(head);
        } else {
            Nodo aux = tail;
            while (aux.getNext().getValue().getId() < nuevoNodo.getValue().getId()) {
                aux = aux.getNext();
            }

            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void imprimir() {
        Nodo aux = head;
        while (aux != tail){
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();           
        }
        System.out.println(tail.getValue().toString());
    }
}

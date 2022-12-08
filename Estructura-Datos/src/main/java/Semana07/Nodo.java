/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07;

/**
 *
 * @author usuario
 */
public class Nodo {
    private Persona value;
    private Nodo next;
    private Nodo back;

    public Nodo(Persona value, Nodo next, Nodo back) {
        this.value = value;
        this.next = next;
        this.back = back;
    }

    public Nodo(Persona value) {
        this.value = value;
    }
    

    public Nodo() {
    }

    public Persona getValue() {
        return value;
    }

    public void setValue(Persona value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getBack() {
        return back;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07;

import Semana03.node;

/**
 *
 * @author usuario
 */
public class Lista {
    private node<Persona> head;

    public Lista() {
    }
    
    public void insertar(Persona value){
        node<Persona> nuevoNodo = new node<Persona>(value);
        if (head == null ){
            head = nuevoNodo;
        }
        else if( head.getValue().getId()> nuevoNodo.getValue().getId()){
            
            nuevoNodo.setNext(head);
            head = nuevoNodo;
        }
        else if(head.getValue().getId()<nuevoNodo.getValue().getId() && head.getNext() == null){
            
            head.setNext(nuevoNodo);
        }
        else{
            node <Persona> aux=head;
            while(aux.getNext() != null && aux.getNext().getValue().getId()< nuevoNodo.getValue().getId()){
               aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }
    
    public void imprimir (){
        node<Persona> aux= head;
        while(aux != null){
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
            
            
        }
    }
    
    /*public void eliminar (Persona value){
        node<Persona> nuevoNodo = new node<Persona>(value);
        node<Persona> aux= head;
        System.out.print("Digite el id a eliminar");
        if(nuevoNodo.getValue().getId() =)
    }
    */
}

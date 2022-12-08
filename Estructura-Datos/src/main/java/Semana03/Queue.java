/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana03;

/**
 *
 * @author usuario
 */
public class Queue <T> {
    
    public node<T> head;
    public node<T> tail;
    
    public void enqueue(T value){
        node nuevo = new node();
        if(head == null){
            head = nuevo;
            tail= nuevo;
        }
        else{
            tail.setNext(nuevo);
            tail=nuevo;
            
        }
    }
    public node<T> dequeue(){
        if(head == null){
            System.out.println("La cola esta vacia");
            return null;
        }
        else{
            node<T> firsInQueue = head;
            head = head.getNext();
            return firsInQueue;
            
        }
    }
    
    public node<T> findByIndex(int i){
        
        if(head == null){
            System.out.println("La cola esta vacia");
            return null;
            
        }
        else{
            
            node<T> temp = head;     
            while( temp.getNext().equals(null) && i != 0 ){
                temp = temp.getNext();
                i--;
            }
            if( i == 0){
                return temp;
            }
            else{
                System.out.println("La cola no cuenta con tantos valores");
                return null;
            }
        }
        
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana03;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila<Integer> Pila = new Pila<Integer>();
        Pila.push(1);
        Pila.push(2);
        Pila.push(4);
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        
        
        
        
        Queue<Integer> Cola = new Queue<Integer>();
        Cola.enqueue(1);
        Cola.enqueue(2);
        Cola.enqueue(4);
        System.out.println(Cola.dequeue());
        System.out.println(Cola.dequeue().getValue());
    
        
        Queue<Integer> prueba = new Queue<Integer>();
        for(int i = 0; i<101;i++){
            prueba.enqueue(i);
           
        }
        
    int temp = prueba.findByIndex(23).getValue();
    Queue<Integer> prueba2 = new Queue<Integer>();
    prueba2.enqueue(temp);
    for(int i =0 ; i<100;i++){
        prueba2.enqueue(i);
    }
    }
    
}

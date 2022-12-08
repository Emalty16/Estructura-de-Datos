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
        pila();
        
        queue();
        
    }
    
    public static void pila(){
        Pila pila = new Pila();      
        System.out.println("<<-- Ejemplo de Pila -->>\n");      
        pila.apilar(23);
        pila.apilar(78);
        pila.apilar(221263);
        pila.apilar(55);
        pila.apilar(12);
      
        System.out.println("<<-- Pila -->>");
        pila.listar();
        System.out.println("\n<<-- Tamaño -->");
        System.out.println(pila.getTamanio());
        
        System.out.println("\n<<-- Retirar el elemento del tope de la pila -->>");
        pila.pop();
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());
        
        System.out.println("\n<<-- Consulta si existe el valor 65 -->>");
        System.out.println(pila.find(78));
        
        System.out.println("\n<<-- Elimina la pila -->>");
        pila.eliminar();
        
        System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
        System.out.println(pila.esVacia());
        
        System.out.println("\n\n<<-- Fin de ejemplo pila -->>");
    }
    
    
    public static void queue(){
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

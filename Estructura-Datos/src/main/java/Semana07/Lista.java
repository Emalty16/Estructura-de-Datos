/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07;


/**
 *
 * @author usuario
 */
public class Lista {
    
    
    private Nodo head;
    private int tamanio;

    public Lista() {
    }
    
    public void insertar(Persona value){
        Nodo nuevoNodo = new Nodo(value);
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
            Nodo aux=head;
            while(aux.getNext() != null && aux.getNext().getValue().getId()< nuevoNodo.getValue().getId()){
               aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }
    
    public void imprimir (){
        Nodo aux= head;
        while(aux != null){
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
                      
        }
    }
    
    /*public void eliminar (Persona value){
        Nodo nuevoNodo = new Nodo();
        Nodo aux= head;
        System.out.print("Digite el id a eliminar");
        if( head.getValue().getId()> nuevoNodo.getValue().getId()){
            if(nuevoNodo.getValue()== 0){
                head = head.getNext();
            }
            else{
                for(int i =0; i< value-1; i++){
                    aux = aux.getNext();
                }
                Nodo n = aux.getNext();
                aux.setNext(n.getNext());
            }
            tamanio--;
        }
    }*/
    
    public void elimina (int id) {
        Nodo aux = new Nodo();
         if(head == null) {
            aux = head;
            aux.setNext(head);               
                aux = head;
            
                while(aux.getNext() != null && aux.getNext().getValue().getId() < id){
                    aux = aux.getNext();
                }

                if (aux.getNext() != null && aux.getNext().getValue().getId() == id){
                    aux.setNext(aux.getNext().getNext());
                }
            }
        }
    
    public int getTamanio(){
        return tamanio;
    }
    
}

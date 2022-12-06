/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana07;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code  logic here
        
        /*Lista list = new Lista();
        
        list.insertar(new Persona(1,"P"));
        list.insertar(new Persona(2, "E"));
        list.insertar(new Persona(5, "A"));
        list.insertar(new Persona(4, "D"));
        list.insertar(new Persona(3, "M"));
        list.imprimir();*/
        
        arbol();
    }
    
    public static void arbol(){
        
        Arbol a = new Arbol();
        
        a.insert(50);
        a.insert(20);
        a.insert(80);
        a.insert(15);
        a.insert(30);
        a.insert(60);
        a.insert(40);
        a.insert(90);
        a.insert(75);
        a.insert(33);
        a.insert(82);
        
        a.inOrden();
    }
    
    
}

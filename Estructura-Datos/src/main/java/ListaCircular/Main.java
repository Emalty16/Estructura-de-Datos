/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ListaCircular;

import Semana07.Persona;



/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListCirc c = new ListCirc();
        c.insertar(new Persona(1, "E"));
        c.insertar(new Persona(5, "A"));
        c.insertar(new Persona(3, "B"));
        c.insertar(new Persona(2, "N"));
        c.insertar(new Persona(4, "R"));
        c.imprimir();
        
    }
    
}

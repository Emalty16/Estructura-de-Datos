/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07;

public class Node {
    
    private int id;
    private Node izq;
    private Node der;

    public Node(int id, Node izq, Node der) {
        this.id = id;
        this.izq = izq;
        this.der = der;
    }

    public Node() {
    }

    public Node(int id) {
        this.id = id;
    }
    
    public Node(Node izq, Node der) {
        this.izq = izq;
        this.der = der;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Node getIzq() {
        return izq;
    }

    public void setIzq(Node izq) {
        this.izq = izq;
    }

    public Node getDer() {
        return der;
    }

    public void setDer(Node der) {
        this.der = der;
    }
    
    
    
}

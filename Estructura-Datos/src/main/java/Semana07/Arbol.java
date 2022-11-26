package Semana07;

public class Arbol {
    
    private Node raiz;
    private int altura;
    
    public void insert(int value){
        if(raiz == null){
            raiz = new Node(value); 
        }
        else{
            insertar(raiz, value);
        }
    }
    public void insertar(Node nodo, int value){
        if(value <= nodo.getId()){
            if(nodo.getIzq()== null){
                nodo.setIzq(new Node(value));
            }
            else{
                insertar(nodo.getIzq(), value);
            }
        }
        else{
            if(nodo.getDer()== null){
                nodo.setDer(new Node(value));
            }
            else{
                insertar(nodo.getDer(), value);
            }
        }
    }
    
    public void inOrden(){
        if(raiz != null){
            inOrdenRecorrer(raiz);
            
        } 
        else{
            System.out.println("Arbol vacio...");
        }
        
    }
    
    public void inOrdenRecorrer(Node nodo){
        if(nodo != null){
            inOrdenRecorrer(nodo.getIzq());
            System.out.println(nodo.getIzq() + " , ");
            inOrdenRecorrer(nodo.getDer());
        }
    }
    
    public void retornarAltura(Node nodo, int nivel){
        
    }
}

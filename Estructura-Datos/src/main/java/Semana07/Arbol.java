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
        if( nodo != null){
            retornarAltura(nodo.getIzq(), nivel +1);
            if(nivel > altura){
                altura = nivel;
                }
                System.out.println("En este momento, gire a la derecha " + nodo.getId());
                retornarAltura(nodo.getDer(), nivel + 1);          
        }
    }
    
    public int retornaAltura(){
        altura = 0;
        retornarAltura(raiz, 1);
        System.out.println(altura);
        return altura;
    }
}

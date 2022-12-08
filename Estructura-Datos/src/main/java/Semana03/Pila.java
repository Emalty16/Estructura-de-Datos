
package Semana03;

/**
 *
 * @author Emalty16
 */
public class Pila <T>{
    
    private node<T> top;
    private int tamanio;
    
    
    
    
    public void apilar(int valor){
        node nuevo = new node();
        nuevo.setValue(valor);
        if (esVacia()) {
            top = nuevo;
        }
        else{
            nuevo.setNext(top);
            top = nuevo;
        }
        tamanio++;
    } 
    
    public boolean esVacia(){
        return top == null;
    }
    
    public void pop(){
        if (!esVacia()) {
            top = top.getNext();
            tamanio--;
        }
    }
    
    public boolean find(int referencia){
        node aux = top;
        boolean exist = false;
        while(exist!= true && aux != null){
            if (referencia == aux.getValue()) {
                exist = true;
            }
            else{
                aux = aux.getNext();
            }
        }
        return exist;
    }
    
    public void listar(){
        node aux = top;
        while(aux != null){
            System.out.println("|\n" + aux.getValue()+ "\n|");
            System.out.println("-----------------");
            aux = aux.getNext();
        }
    }
    public void eliminar(){
        top = null;
        tamanio = 0;
    }

    public node<T> getTop() {
        return top;
    }

    public void setTop(node<T> top) {
        this.top = top;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}

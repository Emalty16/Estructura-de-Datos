
package Semana03;

/**
 *
 * @author Emalty16
 */
public class Pila <T>{
    
    private node<T> top;
    
    
    public void push(T value){
        node<T> newNode= new node<T>(value);
        
        if(top== null){
            top=newNode;
        } else{
            newNode.setNext(top);
            top = newNode;
        }
        
    }
    
    public T pop(){
        node<T> popped_value = top;
        if(top != null){
            top=top.getNext();
            return popped_value.getValue();
        }else{
           return null;
        }
    }
    
    public boolean find(int x){
        //crear una copia de la pila original
        node aux = this.top;
        // bandera para verficar si existe el elemento a buscar
        boolean exist = false;
        
        while(exist != true && aux != null){
            if (x == aux.getValue()){
                exist = true;
            }
            else{
                aux = aux.getNext();
                
            }
        }
        return exist;
    }   
}

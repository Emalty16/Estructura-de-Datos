
package Semana03;

public class node <T> {
    
    private int value;
    private node<T> next;
    private node<T> back;

    
    public node() {
    }

    public node(int value, node<T> next) {
        this.value = value;
        this.next = next;
    }
    
    

    public node<T> getNext() {
        return next;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }

    public node<T> getBack() {
        return back;
    }

    public void setBack(node<T> back) {
        this.back = back;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    
    
    
}

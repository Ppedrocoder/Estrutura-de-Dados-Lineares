package TADLista;

import jdk.jshell.spi.ExecutionControl;

public class lista_array {
    private int size;
    private int capacity;
    private Object[] a;
    public lista_array(){
        this.size = 0;
        this.capacity = 8;
        this.a = new Object[this.capacity];
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public boolean isFirst(Object n){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        return n.equals(a[0]);
    }
    public boolean isLast(Object n){
        return n.equals(a[0]);
    }
    public Object first(){
        return a[0];
    } 
    public Object last(){
        return a[size()-1];
    }
    public Object before(int rank){
        return a[rank-1];
    } 
    public Object after(int rank){
        return a[rank+1];
    }
    public void replaceElement(Object atual, Object novo){
        for (int i = 0; i < size(); i++) {
            if(a[i] == atual){
                a[i] = novo; 
                break;
            } 
            if(i == size()-1){
                throw new RuntimeException("Elemento não encontrado");
            }
        }
    }
    public void swapElements(Object n, Object o){
        int index_n = -1;
        int index_o = -1;
        for (int i = 0; i < size(); i++) {
            if(a[i] == n) index_n = i;
            if(a[i] == o) index_o = i;
        }
        if(index_n == -1 || index_o == -1){
            throw new RuntimeException("Elemento não encontrado");
        } 
        a[index_n] = o;
        a[index_o] = n;
    }
    public void insertBefore(Object atual, Object novo){
        int index_atual = -1;
        for (int i = 0; i < size(); i++) {
            if(a[i] == atual) index_atual = i;
        }
        if(index_atual == -1){
            throw new RuntimeException("Elemento não encontrado");
        }
        for (int i = size(); i > index_atual-1; i++) {
            a[i] = a[i-1];
        } 
        a[index_atual-1] = novo;
        this.size++;
    }
    public void insertAfter(){}
    public void insertFirst(Object o){
        for (int i = size(); i > 0; i++) {
            a[i] = a[i-1];
        }
        a[0] = o;
        this.size++;
    }
    public void insertLast(Object o){
        a[size()] = o;
        this.size++;
    }
    public void remove(){}
}

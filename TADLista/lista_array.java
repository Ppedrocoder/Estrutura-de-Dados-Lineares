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
    private void increase_capacity(){
        Object new_vetor[] = new Object[capacity * 2];
        for (int i = 0; i < size(); i++) {
            new_vetor[i] = this.a[i];
        }
        this.capacity *= 2;
        this.a = new_vetor;
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
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        return n.equals(a[size()-1]);
    }
    public Object first(){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        return a[0];
    } 
    public Object last(){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        return a[size()-1];
    }
    public Object before(int rank){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        if(rank <= 0 || rank >= size()) throw new RuntimeException("Fora dos limites");
        return a[rank-1];
    } 
    public Object after(int rank){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        if(rank < 0 || rank >= size()-1) throw new RuntimeException("Fora dos limites");
        return a[rank+1];
    }
    public void replaceElement(Object atual, Object novo){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        for (int i = 0; i < size(); i++) {
            if(a[i].equals(atual)){
                a[i] = novo; 
                break;
            } 
            if(i == size()-1){
                throw new RuntimeException("Elemento não encontrado");
            }
        }
    }
    public void swapElements(Object n, Object o){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        int index_n = -1;
        int index_o = -1;
        for (int i = 0; i < size(); i++) {
            if(a[i].equals(n)) index_n = i;
            if(a[i].equals(o)) index_o = i;
        }
        if(index_n == -1 || index_o == -1){
            throw new RuntimeException("Elemento não encontrado");
        } 
        a[index_n] = o;
        a[index_o] = n;
    }
    public void insertBefore(Object atual, Object novo){
        if(size() == this.capacity) increase_capacity();
        int index_atual = -1;
        for (int i = 0; i < size(); i++) {
            if(a[i].equals(atual)) index_atual = i;
        }
        if(index_atual == -1){
            throw new RuntimeException("Elemento não encontrado");
        }
        if(index_atual == 0){
            insertFirst(novo);
            return;
        }
        for (int i = size(); i > index_atual - 1; i--) {
            a[i] = a[i-1];
        } 
        a[index_atual - 1] = novo;
        this.size++;
    }
    public void insertAfter(Object atual, Object novo){
        if(size() == this.capacity) increase_capacity();
        int index_atual = -1;
        for (int i = 0; i < size(); i++) {
            if(a[i].equals(atual)) index_atual = i;
        }
        if(index_atual == -1){
            throw new RuntimeException("Elemento não encontrado");
        }
        if(index_atual == size()-1){
            insertLast(novo);
            return;
        }
        for (int i = size(); i > index_atual+1; i--) {
            a[i] = a[i-1];
        } 
        a[index_atual+1] = novo;
        this.size++;
    }
    public void insertFirst(Object o){
        if(size() == this.capacity) increase_capacity();
        if (isEmpty()){
            a[0] = o;
            this.size++;
            return;
        }
        for (int i = size(); i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0] = o;
        this.size++;
    }
    public void insertLast(Object o){
        if(size()+1 == this.capacity) increase_capacity();
        if(isEmpty()){
            a[0] = o;
            this.size++;
            return;
        }
        a[size()] = o;
        this.size++;
    }
    public void remove(Object o){
        if(isEmpty()){
            throw new RuntimeException("Lista Vazia");
        }
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if(a[i].equals(o)){
                index = i;
                break;
            }
        }
        if(index == -1){
            throw new RuntimeException("Elemento não encontrado");
        }
        for (int i = index; i < size()-1; i++) {
            a[i] = a[i + 1];
        }
        a[size()-1] = null;
        this.size--;
    }
}

package TADSequencia;

public class sequencia_linked {
    private no inicio;
    private no fim;
    private int size;
    public sequencia_linked(){
        this.inicio = new no();
        this.fim = new no();
        this.inicio.setNext(fim);
        this.fim.setPrev(inicio);
        this.size = 0;
    }
    private int find(no node){
        no currante = inicio.getNext();
        for (int i = 0; i < size(); i++) {
            if(currante == node){
                return i;
            }
            currante = currante.getNext();
        }
        return -1;
    }
    public no findnode(int p){
        no currante = inicio.getNext();
        for (int i = 0; i < size(); i++) {
            if(i == p){
                return currante;
            }
            currante = currante.getNext();
        }
        return null;
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public Object elementAtRank(int rank){
        if(isEmpty()){
            throw new RuntimeException("Sequencia Vazia");
        }
        if(rank < 0 || rank >= size()){
            throw new RuntimeException("Fora dos Limites");
        }
        no current = inicio.getNext();
        for(int i = 0; i < size-1; i++){
            if (i == rank) {
                break; 
            }
            current = current.getNext();
        }
        return current.getValue();
    }
    public void replaceAtRank(int rank, Object element){
        if(isEmpty()){
            throw new RuntimeException("Sequencia Vazia");
        }
        if(rank < 0 || rank >= size()){
            throw new RuntimeException("Fora dos Limites");
        }
        no current = inicio.getNext();
        for(int i = 0; i < rank; i++){
            current = current.getNext();
        }
        current.setValue(element);
    }
    public void insertAtRank(int rank, Object o){
        if (rank < 0 || rank > size()) {
            throw new RuntimeException("Fora dos Limites");
        }
        
        else{
            no node = new no();
            node.setValue(o);
            no current = inicio.getNext();
            for(int i = 0; i < rank; i++){
                current = current.getNext();
            }
            no anterior = current.getPrev();
            node.setNext(current);
            node.setPrev(anterior);
            anterior.setNext(node);
            current.setPrev(node);
            this.size++;
        }
        
    }
    public void removeAtRank(int rank){
        if (isEmpty()) {
            throw new RuntimeException("Sequencia Vazia");
        }
        if (rank < 0 || rank >= size()) {
            throw new RuntimeException("Fora dos Limites");
        }
        no current = inicio.getNext();
        for(int i = 0; i < rank; i++){
            current = current.getNext();
        }
        no anteriNo = current.getPrev();
        no proximoNo = current.getNext();
        anteriNo.setNext(proximoNo);
        proximoNo.setPrev(anteriNo);
        this.size--;
    }
    public boolean isFirst(no node){
        if(isEmpty()) throw new RuntimeException("Sequencia Vazia");
        int index = find(node);
        if(index == -1) throw new RuntimeException("Elemento não encontrado");
        return index == 0;
    }
    public boolean isLast(no node){
        if(isEmpty()) throw new RuntimeException("Sequencia Vazia");
        int index = find(node);
        if(index == -1) throw new RuntimeException("Elemento não encontrado");
        return index == size()-1;
    }
    public Object first(){
        if(isEmpty()) throw new RuntimeException("Sequencia Vazia");
        return (inicio.getNext()).getValue();
    }
    public Object last(){
        if(isEmpty()) throw new RuntimeException("Sequencia Vazia");
        return (fim.getPrev()).getValue();
    }
    public Object before(int p){
        if(isEmpty()) throw new RuntimeException("Sequencia Vazia");
        if(p < 0 || p > size()-1) throw new RuntimeException("Fora dos Limites");
        if(p == 0) throw new RuntimeException("Elemento não Encontrado");
        if(findnode(p).getPrev().equals(inicio)) throw new RuntimeException("Fora dos Limites");
        no atual = findnode(p);
        return atual.getPrev().getValue();
    }
    public Object after(int p){
        if(isEmpty()) throw new RuntimeException("Sequencia Vazia");
        if(p <0 || p > size()-1) throw new RuntimeException("Fora dos Limites");
        if(p == size()-1) throw new RuntimeException("Elemento não Encontrado");
        if(findnode(p).getNext().equals(fim)) throw new RuntimeException("Fora dos Limites");
        no atual = findnode(p);
        return atual.getNext().getValue();
    }
    public void replaceElement(no node, Object o){
        if(isEmpty()) throw new RuntimeException("Sequencia Vazia");
        if(find(node) == -1) throw new RuntimeException("Elemento não encontrado");
        node.setValue(o);
    }
    public void swapElements(no um, no dois){
        if(isEmpty()) throw new RuntimeException("Sequencia Vazia");
        if(find(um) == -1 || find(dois) == -1) throw new RuntimeException("Elemento não encontrado");
        if(size() < 2) throw new RuntimeException("Número de Elementos Menor que Dois");
        Object value_um = um.getValue();
        um.setValue(dois.getValue());
        dois.setValue(value_um); 
    }
    public void insertBefore(no node, Object o){
        if(find(node) == -1) throw new RuntimeException("Elemento não encontrado");
        no novo = new no();
        novo.setValue(o);
        novo.setNext(node);
        novo.setPrev(node.getPrev());
        (node.getPrev()).setNext(novo);
        node.setPrev(novo);
        this.size++;
    }
    public void insertAfter(no node, Object o){
        if(find(node) == -1) throw new RuntimeException("Elemento não encontrado");
        no novo = new no();
        novo.setValue(o);
        novo.setPrev(node);
        novo.setNext(node.getNext());
        (node.getNext()).setPrev(novo);
        node.setNext(novo);
        this.size++;
    }
    public void insertFirst(Object o){
        no novo = new no();
        novo.setValue(o);
        novo.setPrev(inicio);
        novo.setNext(inicio.getNext());
        (inicio.getNext()).setPrev(novo);
        inicio.setNext(novo);
        this.size++;
    }
    public void insertLast(Object o){
        no novo = new no();
        novo.setValue(o);
        novo.setNext(fim);
        novo.setPrev(fim.getPrev());
        (fim.getPrev()).setNext(novo);
        fim.setPrev(novo);
        this.size++;
    }
    public void remove(no node){
        if(isEmpty()) throw new RuntimeException("Sequencia Vazia");
        if(find(node) == -1) throw new RuntimeException("Elemento não encontrado");
        (node.getPrev()).setNext(node.getNext());
        (node.getNext()).setPrev(node.getPrev());
        this.size--;
    }
}

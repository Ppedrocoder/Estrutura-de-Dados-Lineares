package TADLista;

public class lista_linked {
    private no inicio;
    private no fim;
    private int size;
    public lista_linked(){
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
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public boolean isFirst(no node){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        int index = find(node);
        if(index == -1) throw new RuntimeException("Elemento não encontrado");
        return index == 0;
    }
    public boolean isLast(no node){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        int index = find(node);
        if(index == -1) throw new RuntimeException("Elemento não encontrado");
        return index == size()-1;
    }
    public Object first(){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        return inicio.getNext();
    }
    public Object last(){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        return fim.getPrev();
    }
    public Object before(no node){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        if(find(node) == -1) throw new RuntimeException("Elemento não encontrado");
        return node.getPrev();
    }
    public Object after(no node){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        if(find(node) == -1) throw new RuntimeException("Elemento não encontrado");
        return node.getNext();
    }
    public void replaceElement(no node, Object o){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        if(find(node) == -1) throw new RuntimeException("Elemento não encontrado");
        node.setValue(o);
    }
    public void swapElements(no um, no dois){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        if(find(um) == -1 || find(dois) == -1) throw new RuntimeException("Elemento não encontrado");
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
        node.setPrev(novo);
        this.size++;
    }
    public void insertAfter(no node, Object o){
        if(find(node) == -1) throw new RuntimeException("Elemento não encontrado");
        no novo = new no();
        novo.setValue(o);
        novo.setPrev(node);
        novo.setNext(node.getNext());
        node.setNext(novo);
        this.size++;
    }
    public void insertFirst(no node, Object o){
        if(find(node) == -1) throw new RuntimeException("Elemento não encontrado");
        no novo = new no();
        novo.setValue(o);
        novo.setPrev(inicio);
        novo.setNext(inicio.getNext());
        inicio.setNext(novo);
        this.size++;
    }
    public void insertLast(no node, Object o){
        if(find(node) == -1) throw new RuntimeException("Elemento não encontrado");
        no novo = new no();
        novo.setValue(o);
        novo.setNext(fim);
        novo.setPrev(fim.getPrev());
        fim.setPrev(novo);
        this.size++;
    }
    public void remove(no node){
        if(isEmpty()) throw new RuntimeException("Lista Vazia");
        if(find(node) == -1) throw new RuntimeException("Elemento não encontrado");
        (node.getPrev()).setNext(node.getNext());
        (node.getNext()).setPrev(node.getPrev());
        this.size--;
    }
    
}
public class vetor_linked{
    private no inicio;
    private no fim;
    private int size;
    public vetor_linked(){
        this.inicio = new no();
        this.fim = new no();
        this.inicio.setNext(fim);
        this.fim.setPrev(inicio);
        this.size = 0;
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public Object elementAtRank(int rank){
        if(isEmpty()){
            throw new RuntimeException("Vetor Vazio");
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
            throw new RuntimeException("Vetor Vazio");
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
            throw new RuntimeException("Vetor Vazio");
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
}
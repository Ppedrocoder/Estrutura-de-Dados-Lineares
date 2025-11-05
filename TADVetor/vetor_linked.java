public class vetor_linked{
    private no inicio;
    private no fim;
    private int size;
    public vetor_linked(){
        this.inicio = null;
        this.fim = null;
        this.size = 0;
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public Object elementAtRank(int rank){
        no current = inicio;
        for(int i = 0; i < size-1; i++){
            if (i == rank) {
                break; 
            }
            current = current.getNext();
        }
        return current.getValue();
    }
    public void replaceAtRank(int rank, Object element){
        no current = inicio;
        for(int i = 0; i < size-1; i++){
            if (i == rank) {
                current.setValue(element);
            }
            current = current.getNext();
        }
    }
    public void insertAtRank(int rank, Object o){
        if (rank < 0 || rank > size()) {
            throw new RuntimeException("Fora dos Limites");
        }
        no node = new no();
        node.setValue(o);
        if (isEmpty()) {
            inicio.setNext(node);
            fim.setPrev(node);
            this.size++;
        }
        else{
            no current = inicio;
            for(int i = 0; i < size-1; i++){
                if (i == rank) {
                    current.getPrev().setNext(node);
                    current.setPrev(node);
                    break; 
                }
                current = current.getNext();
            }
            this.size++;
        }
        
    }
    public void removeAtRank(int rank){
        if (isEmpty()) {
            throw new RuntimeException("Vetor Vazio");
        }
        if (rank < 0 || rank > size()) {
            throw new RuntimeException("Fora dos Limites");
        }
        if (size() == 1) {
            this.inicio = null;
            this.fim = null;
            size--;
            return;
        }
        no current = inicio;
        for(int i = 0; i < size-1; i++){
            if (i == rank) {
                no anteriNo = current.getPrev();
                no proximoNo = current.getNext();
                anteriNo.setNext(proximoNo);
                proximoNo.setPrev(anteriNo);
                break; 
            }
            current = current.getNext();
        }
    }
}
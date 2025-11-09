public class vetor_array {
    private int size;
    private int capacity;
    private Object vetor[];

    public vetor_array() {
        this.size = 0;
        this.capacity = 8;
        this.vetor = new Object[capacity];
    }

    private void increase_capacity(){
        Object new_vetor[] = new Object[capacity * 2];
        for (int i = 0; i < size(); i++) {
            new_vetor[i] = this.vetor[i];
        }
        this.capacity *= 2;
        this.vetor = new_vetor;
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
        return this.vetor[rank];
    }
    public void replaceAtRank(int rank, Object element){
        if(isEmpty()){
            throw new RuntimeException("Vetor Vazio");
        }
        if(rank < 0 || rank >= size()){
            throw new RuntimeException("Fora dos Limites");
        }
        this.vetor[rank] = element;
    }
    public void insertAtRank(int rank, Object element){
        if(rank < 0 || rank > size()){
            throw new RuntimeException("Fora dos Limites");
        }
        if(size() == this.capacity) increase_capacity();
        for (int i = size(); i > rank; i--) {
            this.vetor[i] = this.vetor[i-1];
        }
        this.vetor[rank] = element;
        this.size++;
    }
    public void removeAtRank(int rank){
        if(isEmpty()){
            throw new RuntimeException("Vetor Vazio");
        }
        if(rank < 0 || rank >= size()){
            throw new RuntimeException("Fora dos Limites");
        }
        if(rank == size()-1){
            this.size--;
            return;
        } 
        for (int i = rank; i < size()-1; i++) {
            this.vetor[i] = this.vetor[i+1];
        }
        this.size--;
    }
}

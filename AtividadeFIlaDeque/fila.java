public class fila{
    private int capacidade;
    private Object inicio;
    private int N;
    private Object a[];
    public fila(int capacidade){
        a = new Object[capacidade];
        this.capacidade = capacidade;
        N = -1;
    }
    public int tamanho(){
        return N+1;
    }
    public boolean estaVazia(){
        return N == -1;
    }
    public Object inicio(){
        if (estaVazia()) {
            throw new EFilaVazia("A fila está vazia");
        }
    }
    
    public void enfileirar(Object o){
        if (N==-1) {
            
        }
    }
    public Object desenfileirar(){
        if (estaVazia()) {
            throW new EFilaVazia("A fila está vazia");
        }
        
    }
}
public class deque {
    int N;
    no inicio, fim;

    public deque(){
        this.N=0;
        inicio = null;
        fim = null; 
    }
    public Object primeiro(){
        if(estaVazia()){
            throw new DequeVazioExcecao("o deque está vazia");
        }
        return inicio.getElemento();
    }
    public Object ultimo(){
        if(estaVazia()){
            throw new DequeVazioExcecao("o deque está vazia");
        }
        return fim.getElemento();
    }
    public int tamanho(){
        return N;
    }
    public boolean estaVazia(){
        return N==0;
    }
    public void inserirInicio(Object o){
        if(estaVazia()){
            no novo = new no();
            novo.setElemento(o);
            novo.setProximo(null);
            inicio = novo;
            fim = novo;
            N+=1;
            return;
        }
        if(N==1){
            no novo = new no();
            novo.setElemento(o);
            novo.setProximo(inicio);
            inicio = novo;
            N+=1;
            return;
        }
        no novo = new no();
        novo.setElemento(o);
        novo.setProximo(inicio);
        inicio = novo;
        N+=1;
    }
    public void inserirFim(Object o){
        if(estaVazia()){
            no novo = new no();
            novo.setElemento(o);
            novo.setProximo(null);
            inicio = novo;
            fim = novo;
            N+=1;
            return;
        }
        if(N==1){
            no novo = new no();
            novo.setElemento(o);
            novo.setProximo(null);
            inicio.setProximo(novo);
            fim = novo;
            N+=1;
            return;
        }
        no novo = new no();
        novo.setElemento(o);
        novo.setProximo(null);
        fim.setProximo(novo);
        fim = novo;
        N+=1;
    }
    public Object removerInicio(){
        if(estaVazia()){
            throw new DequeVazioExcecao("o deque está vazia");
        }
        if(N==1){
            Object o = inicio.getElemento();
            inicio = null;
            fim = null;
            N-=1;
            return o;
        }
        Object o = inicio.getElemento();
        inicio = inicio.getProximo();
        N-=1;
        return o;
    }
    public Object removerFim(){
        if(estaVazia()){
            throw new DequeVazioExcecao("A fila está vazia");
        }
        if(N==1){
            Object o = fim.getElemento();
            inicio = null;
            fim = null;
            N-=1;
            return o;
        }
        Object o = fim.getElemento();
        no current = inicio;
        for (int i = 0; i < N; i++) {
            if(i == N-2){
                current.setProximo(null);
                fim = current;
                N-=1;
                break;
            }
            current = current.getProximo();
        }
        return o;
    }
}

public class dequeD {
    int N;
    noD inicio, fim;

    public dequeD(){
        this.N=0;
        inicio = null;
        fim = null; 
    }
    public Object primeiro(){
        if(estaVazia()){
            throw new DequeVazioExcecao("o deque está vazio");
        }
        return inicio.getElemento();
    }
    public Object ultimo(){
        if(estaVazia()){
            throw new DequeVazioExcecao("o deque está vazio");
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
            noD novo = new noD();
            novo.setElemento(o);
            novo.setProximo(null);
            novo.setAnterior(null);
            inicio = novo;
            fim = novo;
            N+=1;
            return;
        }
        if(N==1){
            noD novo = new noD();
            novo.setElemento(o);
            novo.setProximo(inicio);
            novo.setAnterior(null);
            inicio = novo;
            N+=1;
            return;
        }
        noD novo = new noD();
        novo.setElemento(o);
        novo.setProximo(inicio);
        novo.setAnterior(null);
        inicio.setAnterior(novo);
        inicio = novo;
        N+=1;
    }
    public void inserirFim(Object o){
        if(estaVazia()){
            noD novo = new noD();
            novo.setElemento(o);
            novo.setProximo(null);
            novo.setAnterior(null);
            inicio = novo;
            fim = novo;
            N+=1;
            return;
        }
        if(N==1){
            noD novo = new noD();
            novo.setElemento(o);
            novo.setProximo(null);
            novo.setAnterior(inicio);
            inicio.setProximo(novo);
            fim = novo;
            N+=1;
            return;
        }
        noD novo = new noD();
        novo.setElemento(o);
        novo.setProximo(null);
        novo.setAnterior(fim);
        fim.setProximo(novo);
        fim = novo;
        N+=1;
    }
    public Object removerInicio(){
        if(estaVazia()){
            throw new DequeVazioExcecao("o deque está vazio");
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
        inicio.setAnterior(null);
        N-=1;
        return o;
    }
    public Object removerFim(){
        if(estaVazia()){
            throw new DequeVazioExcecao("O deque está vazio");
        }
        if(N==1){
            Object o = fim.getElemento();
            inicio = null;
            fim = null;
            N-=1;
            return o;
        }
        Object o = fim.getElemento();
        noD penultimo = fim.getAnterior();
        penultimo.setProximo(null);
        fim = penultimo;
        N-=1;
        return o;
    }
}

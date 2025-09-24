public class PilhaRubroNegras{
    private int capacidade;
    private Object[] a;
    private int tPreto;
    private int tPreto_real;
    private int tVermelho;
    public PilhaRubroNegras(int capacidade){
        this.capacidade=capacidade;
        tPreto_real=capacidade;
        tPreto=-1;
        tVermelho=-1;
        a=new Object[capacidade];
    }
    public int getCapacidade(){
        return capacidade;
    }
    public int sizePreto(){
        return tPreto+1;
    }    
    public boolean isEmptyPreto(){
        return tPreto==-1;
    }
    public Object topPreto() throws PilhaVaziaExcecao{
        if(isEmptyPreto()){
            throw new PilhaVaziaExcecao("A pilha está vazia");
        }
        return a[tPreto_real];
    }
    public void pushPreto(Object o){
        if(tPreto>=capacidade-1 || tVermelho+1 == tPreto_real){
            int antiga_capacidade = capacidade-1;
            capacidade*=2;
            Object b[]=new Object[capacidade];
            for(int f=0;f<=tVermelho;f++)
                b[f]=a[f];
            int qtd=0;
            int index = capacidade-1;
            while(qtd<sizePreto()){
                b[index--] = a[antiga_capacidade--];
                qtd++;
            }
            this.tPreto_real = capacidade - sizePreto();
            a=b;
        }
        a[--tPreto_real]=o;
        tPreto++; 
    }
    public Object popPreto() throws PilhaVaziaExcecao{
        if(isEmptyPreto()){
            throw new PilhaVaziaExcecao("A pilha está vazia");
        }
        if((tVermelho+tPreto) <= capacidade/3){
            int antiga_capacidade = capacidade-1;
            capacidade/=2;
            Object b[]=new Object[capacidade];
            for(int f=0;f<=tVermelho;f++)
                b[f]=a[f];
            int qtd=0;
            int index = capacidade-1;
            while(qtd<sizePreto()){
                b[index--] = a[antiga_capacidade--];
                qtd++;
            }
            this.tPreto_real = capacidade - sizePreto();
            a=b;
        }
        tPreto--;
        return a[tPreto_real++];
    }

    public int sizeVermelho(){
        return tVermelho+1;
    }    
    public boolean isEmptyVermelho(){
        return tVermelho==-1;
    }
    public Object topVermelho() throws PilhaVaziaExcecao{
        if(isEmptyVermelho()){
            throw new PilhaVaziaExcecao("A pilha está vazia");
        }
        return a[tVermelho];
    }
    public void pushVermelho(Object o){
        if(tVermelho>=capacidade-1 || tVermelho+1 == tPreto_real){
            int antiga_capacidade = capacidade-1;
            capacidade*=2;
            Object b[]=new Object[capacidade];
            for(int f=0;f<=tVermelho;f++)
                b[f]=a[f];
            int qtd=0;
            int index = capacidade-1;
            while(qtd<sizePreto()){
                b[index--] = a[antiga_capacidade--];
                qtd++;
            }
            this.tPreto_real = capacidade - sizePreto();
            a=b;
        }
        a[++tVermelho]=o;
    }
    public Object popVermelho() throws PilhaVaziaExcecao{
        if(isEmptyVermelho()){
            throw new PilhaVaziaExcecao("A pilha está vazia");
        }
        if((sizePreto()+sizeVermelho()) <= capacidade/3){
            int antiga_capacidade = capacidade-1;
            capacidade/=2;
            Object b[]=new Object[capacidade];
            for(int f=0;f<=tVermelho;f++)
                b[f]=a[f];
            int qtd=0;
            int index = capacidade-1;
            while(qtd<sizePreto()){
                b[index--] = a[antiga_capacidade--];
                qtd++;
            }
            this.tPreto_real = capacidade - sizePreto();
            a=b;
        }
        
        return a[tVermelho--];
    }
}
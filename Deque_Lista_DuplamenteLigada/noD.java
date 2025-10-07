public class noD {
    private Object elemento;
    private noD proximo;
    private noD anterior;
    public Object getElemento() {
        return elemento;}
    public void setElemento(Object o){
        elemento = o;}
    public void setProximo(noD proximo){
        this.proximo = proximo;
    }
    public noD getProximo(){
        return proximo;
    }
    public void setAnterior(noD anterior){
        this.anterior = anterior;
    }
    public noD getAnterior(){
        return anterior;
    }
}

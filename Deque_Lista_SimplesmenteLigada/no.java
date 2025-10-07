public class no {
    private Object elemento;
    private no proximo;
    public Object getElemento() {
        return elemento;}
    public void setElemento(Object o){
        elemento = o;}
    public void setProximo(no proximo){
        this.proximo = proximo;
    }
    public no getProximo(){
        return proximo;
    }
}
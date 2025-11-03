public class no{
    private Object value;
    private no next;
    private no prev;
    public no(){
        this.value = null;
        this.next = null;
        this.prev = null;
    }
    public void setValue(Object o){
        this.value = o;
    }
    public Object getValue(){
        return this.value;
    }
    public void setNext(no o){
        this.next = o;
    }
    public no getNext(){
        return this.next;
    }
    public void setPrev(no o){
        this.prev = o;
    }
    public no getPrev(){
        return this.prev;
    }
}
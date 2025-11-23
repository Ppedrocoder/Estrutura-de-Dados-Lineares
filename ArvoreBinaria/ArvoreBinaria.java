package ArvoreBinaria;

public class ArvoreBinaria {
    private No root;
    private int size;
    public ArvoreBinaria(Object o) {
        this.root = new No(null, o);
        this.size = 1;
    }
    public No getRoot() {
        return this.root;
    }
}

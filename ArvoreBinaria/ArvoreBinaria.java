package ArvoreBinaria;

import java.util.Iterator;
import java.util.ArrayList;
import static java.lang.Math.max;
import java.util.List;

public class ArvoreBinaria {
    private No root;
    private int size;
    public ArvoreBinaria() {
        this.root = new No(null);
        this.size = 1;
    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public int height(No n){
        int h = 0;
        if (isExternal(n)) {
            return 0;
        }
        else {
            for (No c: children(n)) {
                h = max(h, height(c));
            }
            return 1 + h;
        }
    }
    public List<Object> elements(){
        List<Object> elements = new ArrayList<>(this.size);
        for (No n: nos()) {
            elements.add(n.getElement());
        }
        return elements;
    }
    public List<No> nos(){
        List<No> nos = new ArrayList<>();
        No currant = this.root;
        for (int i = 0; i < this.size; i++) {
            nos.add(currant);
            if (hasLeft(currant))
                currant = currant.getLeftChild();
            else
                currant = currant.getRightChild();
        }   

        return nos;

    }
    public No root() {
        return this.root;
    }
    public No parent(No n){
        return n.getParent();
    }
    public No leftchild(No n){
        return n.getLeftChild();
    }
    public No rightchild(No n){
        return n.getRightChild();
    }
    public List<No> children(No n){

    }
    public boolean isInternal(No n){
        return hasLeft(n) || hasRight(n);
    }
    public boolean isExternal(No n){
        return !hasLeft(n) && !hasRight(n);
    }
    public boolean isRoot(No n){
        return n.getParent() == null;
    }
    public boolean hasLeft(No n){
        return n.getLeftChild() != null;
    }
    public boolean hasRight(No n){
        return n.getRightChild() != null;
    }
    public int depth(No n){

    }
    public void replace(No n, Object o){
        n.setElement(o);
    }
    public void insert(No n){

    }
    public void find(No n){

    }
    public void remove(No n){

    }
}

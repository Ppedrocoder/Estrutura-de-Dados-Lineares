public class teste {
    public static void main(String[] args) {
        deque deque = new deque();
        System.out.println("Vazio");
        System.out.println(deque.estaVazia());
        
        System.out.println("Inserção deque vazio");
        int num = 120;
        deque.inserirInicio(num);
        System.out.println(deque.estaVazia());
        System.out.println(deque.primeiro());
        System.out.println(deque.ultimo());
        System.out.println(deque.tamanho());
        System.out.println("Inserção deque com itens");
        num = 230;
        deque.inserirInicio(num);
        num = 5;
        deque.inserirFim(num);
        System.out.println(deque.estaVazia());
        System.out.println(deque.primeiro());
        System.out.println(deque.ultimo());
        System.out.println(deque.tamanho());
        System.out.println("remoção deque fim com itens");
        deque.removerFim();
        System.out.println(deque.estaVazia());
        System.out.println(deque.primeiro());
        System.out.println(deque.ultimo());
        System.out.println(deque.tamanho());
        System.out.println("remoção deque inicio com itens");
        deque.removerInicio();
        System.out.println(deque.estaVazia());
        System.out.println(deque.primeiro());
        System.out.println(deque.ultimo());
        System.out.println(deque.tamanho());
        System.out.println("deixar deque vazio");
        deque.removerFim();
        System.out.println(deque.estaVazia());
        
        System.out.println("remoção deque vazio");
        deque outro = new deque();
        outro.removerInicio();
    }
}

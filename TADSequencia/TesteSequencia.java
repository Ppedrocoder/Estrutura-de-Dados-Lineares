package TADSequencia;

public class TesteSequencia {
    public static void main(String[] args) {

        sequencia_linked seq = new sequencia_linked();

        System.out.println(seq.isEmpty());
        System.out.println(seq.size());
        seq.insertAtRank(0, "A");
        seq.insertAtRank(1, "B");
        seq.insertAtRank(2, "C");
        seq.insertAtRank(1, "X"); 
        System.out.println(seq.isEmpty());
        System.out.println(seq.size());

        imprimir(seq);  


        System.out.println("\n=== TESTE DE elementAtRank ===");
        System.out.println(seq.elementAtRank(0)); 
        System.out.println(seq.elementAtRank(1)); 
        System.out.println(seq.elementAtRank(3)); 


        System.out.println("\n=== TESTE replaceAtRank ===");
        seq.replaceAtRank(2, "Y"); 
        imprimir(seq);


        System.out.println("\n=== TESTE removeAtRank ===");
        seq.removeAtRank(1);  
        imprimir(seq); 
        System.out.println(seq.size());


        System.out.println("\n=== TESTE insertFirst e insertLast ===");
        seq.insertFirst("FIRST");
        seq.insertLast("LAST");
        imprimir(seq); 
        System.out.println(seq.size());


        System.out.println("\n=== TESTE before / after ===");
        System.out.println("before(2): " + seq.before(2)); 
        System.out.println("after(2):  " + seq.after(2));  


        System.out.println("\n=== TESTE swapElements ===");
        System.out.println("Swap FIRST e LAST");
        seq.swapElements(seq.findnode(0), seq.findnode(seq.size()-1));
        imprimir(seq);


        System.out.println("\n=== TESTE insertBefore / insertAfter ===");
        seq.insertBefore(seq.findnode(2), "BB"); 
        seq.insertAfter(seq.findnode(3), "CC");  
        imprimir(seq);
        System.out.println(seq.size());


        System.out.println("\n=== TESTE REMOVE(no node) ===");
        seq.remove(seq.findnode(1));
        imprimir(seq);
        System.out.println(seq.size());
    }

    public static void imprimir(sequencia_linked seq) {
        System.out.print("[ ");
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.elementAtRank(i) + " ");
        }
        System.out.println("]");
    }
}

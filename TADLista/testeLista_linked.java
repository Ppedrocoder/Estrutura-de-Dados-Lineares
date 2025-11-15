package TADLista;

public class testeLista_linked {
    public static void main(String[] args) {
        lista_linked lista = new lista_linked();
        System.out.println("\nTamanho inicial da lista: " + lista.size());
        System.out.println("\nLista está vazia? " + lista.isEmpty());
        

        // Inserções básicas
        System.out.println("\nInserindo elementos no final:");
        lista.insertLast(1);
        System.out.println("\nPrimeiro: " + lista.first());
        System.out.println("\nÚltimo: " + lista.last());
        lista.insertLast(2);
        System.out.println("\nPrimeiro: " + lista.first());
        System.out.println("\nÚltimo: " + lista.last());
        lista.insertLast(3);
        System.out.println("\nPrimeiro: " + lista.first());
        System.out.println("\nÚltimo: " + lista.last());
        lista.insertLast(4);
        System.out.println("\nPrimeiro: " + lista.first());
        System.out.println("\nÚltimo: " + lista.last());
        System.out.println("\nTamanho da lista: " + lista.size());

        // Inserir no início
        System.out.println("\nInserindo no início (5):");
        lista.insertFirst(5);
        System.out.println("\nPrimeiro: " + lista.first());
        System.out.println("\nÚltimo: " + lista.last());
        System.out.println("\nTamanho da lista: " + lista.size());
            
        // Inserir antes
        no nC = lista.findnode(2); 
        no nY = new no("Y");
        System.out.println("\nInserindo antes de '"+nC.getValue()+"' (Y):");
        lista.insertBefore(nC, nY.getValue());
        System.out.println("\nTamanho da lista: " + lista.size());
            
        // Inserir depois
        no nB = lista.findnode(1); 
        no nZ = new no("Z");
        System.out.println("\nInserindo depois de '"+nB.getValue()+"' (Z):");
        lista.insertAfter(nB, nZ.getValue());
        System.out.println("\nTamanho da lista: " + lista.size());
            
        // Substituir elemento
        no nD = lista.findnode(4); 
        no nW = new no("W");
        System.out.println("\nSubstituindo '"+nD.getValue()+"' por '"+nW.getValue()+"':");
        lista.replaceElement(nD, nW.getValue());
            
        // Trocar elementos
        no nA = lista.findnode(0); 
        no nH = lista.findnode(3); 
        System.out.println("\nTrocando '"+nA.getValue()+"' com '"+nH.getValue()+"':");
        lista.swapElements(nA, nH);
            
        // Teste de remoção
        no nX = lista.findnode(2); 
        no nJ = lista.findnode(3);
        System.out.println("\nRemovendo "+nX.getValue()+" e '"+nJ.getValue()+"':");
        lista.remove(nX);
        lista.remove(nJ);
        System.out.println("\nTamanho da lista: " + lista.size());

        // Teste de métodos de acesso
        System.out.println("\nPrimeiro elemento: " + lista.first());
        System.out.println("Último elemento: " + lista.last());
        System.out.println("Elemento antes do índice 2: " + lista.before(2));
        System.out.println("Elemento depois do índice 1: " + lista.after(1));

        // Tamanho e verificação
        System.out.println("\nTamanho atual da lista: " + lista.size());
        System.out.println("Lista está vazia? " + lista.isEmpty());
    }
}

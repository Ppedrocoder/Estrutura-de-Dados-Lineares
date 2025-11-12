package TADLista;

public class testeLista_linked {
    public static void main(String[] args) {
        lista_linked lista = new lista_linked();
        
         // Criação dos nós
        no nA = new no();
        nA.setValue("a");
        no nB = new no();
        nB.setValue("b");
        no nC = new no();
        nC.setValue("c");
        no nD = new no();
        nD.setValue("d");
        no nX = new no();
        nX.setValue("x");
        no nY = new no();
        nY.setValue("y");
        no nZ = new no();
        nZ.setValue("z");
        no nW = new no();
        nW.setValue("w");

        // Inserções básicas
        System.out.println("\nInserindo elementos no final:");
        lista.insertLast(nA);
        lista.insertLast(nB);
        lista.insertLast(nC);
        lista.insertLast(nD);

        // Inserir no início
        System.out.println("\nInserindo no início (X):");
        lista.insertFirst(nX);
            
        // Inserir antes
        System.out.println("\nInserindo antes de 'C' (Y):");
        lista.insertBefore(nC, nY);
            
        // Inserir depois
        System.out.println("\nInserindo depois de 'B' (Z):");
        lista.insertAfter(nB, nZ);
            
        // Substituir elemento
        System.out.println("\nSubstituindo 'D' por 'W':");
        lista.replaceElement(nD, nW);
            
        // Trocar elementos
        System.out.println("\nTrocando 'A' com 'Z':");
        lista.swapElements(nA, nZ);
            
        // Teste de remoção
        System.out.println("\nRemovendo 'X' e 'Y':");
        lista.remove(nX);
        lista.remove(nY);

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

package TADLista;

public class testeLista_array {
    public static void main(String[] args) {
        lista_array lista = new lista_array();
        System.out.println("\nTamanho inicial da lista: " + lista.size());
        System.out.println("\nLista está vazia? " + lista.isEmpty());

        // Inserções básicas
        System.out.println("\nInserindo elementos no final:");
        lista.insertLast("A");
        System.out.println("\nPrimeiro: " + lista.first());
        System.out.println("\nÚltimo: " + lista.last());
        lista.insertLast("B");
        System.out.println("\nPrimeiro: " + lista.first());
        System.out.println("\nÚltimo: " + lista.last());
        lista.insertLast("C");
        System.out.println("\nPrimeiro: " + lista.first());
        System.out.println("\nÚltimo: " + lista.last());
        lista.insertLast("D");
        System.out.println("\nPrimeiro: " + lista.first());
        System.out.println("\nÚltimo: " + lista.last());
        System.out.println("\nTamanho da lista: " + lista.size());

        // Inserir no início
        System.out.println("\nInserindo no início (X):");
        lista.insertFirst("X");
        System.out.println("\nPrimeiro: " + lista.first());
        System.out.println("\nÚltimo: " + lista.last());
        System.out.println("\nTamanho da lista: " + lista.size());
            
        // Inserir antes
        System.out.println("\nInserindo antes de 'C' (Y):");
        lista.insertBefore("C", "Y");
        System.out.println("\nTamanho da lista: " + lista.size());
            
        // Inserir depois
        System.out.println("\nInserindo depois de 'B' (Z):");
        lista.insertAfter("B", "Z");
        System.out.println("\nTamanho da lista: " + lista.size());
            
        // Substituir elemento
        System.out.println("\nSubstituindo 'D' por 'W':");
        lista.replaceElement("D", "W");
            
        // Trocar elementos
        System.out.println("\nTrocando 'A' com 'Z':");
        lista.swapElements("A", "Z");
            
        // Teste de remoção
        System.out.println("\nRemovendo 'X' e 'Y':");
        lista.remove("X");
        lista.remove("Y");
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

package TADLista;

public class testeLista_array {
    public static void main(String[] args) {
        lista_array lista = new lista_array();
        // Inserções básicas
        System.out.println("\nInserindo elementos no final:");
        lista.insertLast("A");
        lista.insertLast("B");
        lista.insertLast("C");
        lista.insertLast("D");

        // Inserir no início
        System.out.println("\nInserindo no início (X):");
        lista.insertFirst("X");
            
        // Inserir antes
        System.out.println("\nInserindo antes de 'C' (Y):");
        lista.insertBefore("C", "Y");
            
        // Inserir depois
        System.out.println("\nInserindo depois de 'B' (Z):");
        lista.insertAfter("B", "Z");
            
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

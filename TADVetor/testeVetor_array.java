public class testeVetor_array {
    public static void main(String[] args) {
        vetor_array vetor = new vetor_array();
        System.out.println("Vetor está vazio? "+vetor.isEmpty());
        for (int i = 0; i < 10; i++) {
            vetor.insertAtRank(0, i);
            System.out.println("adicionando no rank 0 o valor "+vetor.elementAtRank(0));
        }
        System.out.println("Vetor está vazio? "+vetor.isEmpty());
        System.out.println("vetor está com tamanho = "+vetor.size());
        for (int i = 0; i < 10; i++) {
            System.out.println("o elemento no rank "+i+" é "+vetor.elementAtRank(i));
        }
        vetor.replaceAtRank(9,10);
        System.out.println("o elemento do rank 9 agora é "+vetor.elementAtRank(9));
        for (int i = 0; i < 10; i++) {
            vetor.removeAtRank(0);
        }
        System.out.println("Vetor está vazio? "+vetor.isEmpty());
        System.out.println("vetor está com tamanho = "+vetor.size());
    }
}

import java.util.*;

public class PalavrasRepetidas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva uma frase: ");

        String frase = input.nextLine();

        Set<String> palavras = new HashSet<>();

        String[] listPalavras = frase.split(" ");

        for (String palavra : listPalavras) {
            palavras.add(palavra);
        }

        System.out.printf("Foram detectadas %d palavras únicas\n", palavras.size());

        input.close();
    }
}

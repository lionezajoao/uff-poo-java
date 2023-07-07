import java.util.*;

public class ContPalavras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva uma frase: ");
        String frase = input.nextLine();

        Map<String, Integer> dictPalavras = new HashMap<>();

        String[] listPalavras = frase.split(" ");

        for (String palavra : listPalavras) {
            if ( dictPalavras.get(palavra) == null ) {
                dictPalavras.put(palavra, 1);
            } else {
                dictPalavras.replace(palavra, dictPalavras.get(palavra) + 1);
            }
        }

        System.out.println(dictPalavras);

        input.close();
    }
}
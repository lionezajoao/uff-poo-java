import java.util.Arrays;
import java.util.Scanner;

class Pessoas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Declare a quantidade de pessoas");
        int listSize = input.nextInt();

        String[][] pessoas = new String[listSize][2];
        // int[] idades = new int[listSize];

        for( int i = 0; i < listSize; i++ ) {
            System.out.println("Escreva o nome da pessoa e a idade dela");
            pessoas[i][0] = input.next();
            pessoas[i][1] = input.next();

        }

        Arrays.sort(pessoas[0]);
        // Arrays.sort(idades);

        for( int i = 0; i < listSize; i++ ) {
            System.out.printf("Dado da pessoa %d: %s %s\n", i+1, pessoas[i][0], pessoas[i][1]);
        }

        input.close();

    }
}
import java.util.Scanner;

class Calc {
    public static float calcMedia(float[] notas) {
        float soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        System.out.println(soma);
        return soma / notas.length;
    }
}

public class vetores extends Calc {
    public static void main(String[] args) {
        System.out.println("Declare a quantidade de notas:");
        Scanner input = new Scanner(System.in);
        int vectSize = input.nextInt();

        float[] vector = new float[vectSize];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Declare o valor da nota %d: ", i + 1);
            vector[i] = input.nextFloat();
        }

        float result = calcMedia(vector);

        System.out.printf("A média do aluno é: %.2f\n", result);

        input.close();

    }
}

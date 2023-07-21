import java.util.*;
import java.io.IOException;

public class Calculadora {
    static int soma(int val1, int val2) {
        return val1 + val2;
    }

    static float divisao(int val1, int val2) throws ArithmeticException {
        return val1/val2;
    }

    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva os dos valores a seguir");
        int val1 = input.nextInt();
        int val2 = input.nextInt();

        System.out.println(soma(val1, val2));
        System.out.println(divisao(val1, val2));
        
        input.close();
    }
}

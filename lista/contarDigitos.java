import java.util.Scanner;
public class contarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        int numDigitos = numeroDigitos(numero);

        System.out.println("O número de dígitos é: " + numDigitos);
        scanner.close();
    }

    public static int numeroDigitos(int numero) {
        String numeroString = Integer.toString(numero);
        return numeroString.length();
    }
}

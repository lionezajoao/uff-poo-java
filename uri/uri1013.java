import java.util.Scanner;

class Uri1013 {
    public static void main(String[] args) {
        
        int a, b, c, maior;
        
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        maior = (a + b + Math.abs(a-b)) / 2;
        maior = (maior + c + Math.abs(maior-c)) / 2;

        System.out.println(maior + " eh o maior");
        input.close();
    }
}
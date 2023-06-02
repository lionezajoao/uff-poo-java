import java.util.Scanner;
import java.lang.Math;

class Baskara {

    public static float calculaDelta(float a, float b, float c) {
        return (b*b) - (4*a*c);
    }
    public static void main(String[] args) {
        float a, b, c, delta;
        double x1, x2;
        Scanner input = new Scanner(System.in);


        System.out.print("Digite o valor de a: ");
        a = input.nextFloat();
        System.out.print("Digite o valor de b: ");
        b = input.nextFloat();
        System.out.print("Digite o valor de c: ");
        c = input.nextFloat();

        delta = calculaDelta(a, b, c);

        if (delta >= 0) {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.printf("X1 = %.2f \nX2 = %.2f\n", x1, x2);
        } else {
            System.out.printf("Delta negativo, impossível calcular\n");
        }
        

        input.close();
    }
}
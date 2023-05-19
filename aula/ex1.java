import java.util.Scanner;
import java.lang.Math;

class Ex1 {

    public static int checkIfExists(int a, int b, int c) {
        if (a > (b - c)) & (a < (b + c)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double calculateCoordDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		double x1, y1, x2, y2, x3, y3, a, b, c;

        System.out.print("Set the triangle coordenates: ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.print("Set the triangle coordenates: ");
        x2 = input.nextInt();
        y2 = input.nextInt();
        System.out.print("Set the triangle coordenates: ");
        x3 = input.nextInt();
        y3 = input.nextInt();

        a = calculateCoordDistance(x1, y1, x2, y2);
        b = calculateCoordDistance(x1, y1, x3, y3);
        c = calculateCoordDistance(x2, y2, x3, y3);

        System.out.println(a, b, c);

	}
}

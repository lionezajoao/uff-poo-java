import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		int height, base;
		float area;

		System.out.print("Set the height value: ");
		height = input.nextInt();
		System.out.print("Set the base value: ");
		base = input.nextInt();

		area = 0.5f * height * base;
		System.out.println("Height: " + area);
        input.close();
	}
}

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double r, a, pi = 3.14159;

		r = sc.nextDouble();

		a = pi * r * r;

		System.out.printf("a=%.4f", a);
		
		sc.close();

	}
}
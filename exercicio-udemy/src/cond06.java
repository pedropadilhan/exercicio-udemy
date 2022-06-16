import java.util.Scanner;

public class cond06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.00) {
			System.out.println("Fora do intervalo");
		} 
		else if(numero <= 25.00) {
			System.out.println("Intervalo [0, 25]");
		} 
		else if(numero <= 50.00 && numero >= 25.00) {
			System.out.println("Intervalo [25, 50]");
		} 
		else {
			System.out.println("Intervalo [75, 100]");
		}

		sc.close();
}
}

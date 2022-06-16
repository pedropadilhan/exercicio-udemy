import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int id, horaTrabalhada;
		double valorHora, salario;

		id = sc.nextInt();
		horaTrabalhada = sc.nextInt();
		valorHora = sc.nextDouble();

		salario = horaTrabalhada * valorHora;

		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f", salario);

		sc.close();
	}
}

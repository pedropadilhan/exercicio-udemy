package exercicioFixacao2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		
		System.out.println("Informe seu nome, salário bruto e impostos: ");
		empregado.nome = sc.nextLine();
		empregado.salarioBruto = sc.nextDouble();
		empregado.imposto = sc.nextDouble();
		
		//System.out.printf("Empregado: " + empregado.nome + ", $ %.2f", empregado.salarioBruto);
		System.out.println("Empregado: " + empregado);
		System.out.println();
		System.out.println("Qual porcentagem aumentar do salario? ");
		double porcentagem = sc.nextDouble();
		empregado.aumentarSalario(porcentagem);
		System.out.println("Salario atualizado: " + empregado);
		
		
		
		
		sc.close();

	}

}

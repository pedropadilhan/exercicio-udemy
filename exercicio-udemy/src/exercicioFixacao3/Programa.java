package exercicioFixacao3;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe seu nome e suas 3 notas: ");
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		
		System.out.println("Nota final: " + aluno.notaFinal());
		
		if(aluno.notaFinal() < 60.0) {
			System.out.println("Rodou!");
			System.out.println("Faltaram " + aluno.pontosFaltam() + " pontos.");
		} else {
			System.out.println("Passou!");
		}
		
		sc.close();

	}

}

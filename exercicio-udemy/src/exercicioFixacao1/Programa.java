package exercicioFixacao1;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Emtre com a altura e largura do retangulo: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.printf("Area: %.2f", retangulo.area());
		System.out.printf("\nPerimetro: %.2f", retangulo.perimetro());
		System.out.printf("\nDiagonal:  %.2f", retangulo.diagonal());
		
		sc.close();
	}

}

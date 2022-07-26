package condicionais;
import java.util.Scanner;

public class cond05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int id, qtd;
		
		id = sc.nextInt();
		qtd = sc.nextInt();
		
		double valorTotal;
		
		if(id == 1) {
			valorTotal = qtd * 4.00;  
		} else if(id == 2) {
			valorTotal = qtd * 4.50;
		} else if (id == 3) {
			valorTotal = qtd * 5.00;
		} else if(id == 4) {
			valorTotal = qtd * 2.00;
		} else {
			valorTotal = qtd * 1.50;
		}
		
		System.out.println("Valor total: " + valorTotal);
		
		
		
		sc.close();
	}

}

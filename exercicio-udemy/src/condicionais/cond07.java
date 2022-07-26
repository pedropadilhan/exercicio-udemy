package condicionais;
import java.util.Scanner;

public class cond07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x < 0.0 && y < 0.0 ) {
			System.out.println("Q2");
		} else if(x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if(x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		} else {
			System.out.println("Q3");
		}
		
		
		sc.close();
	}

}

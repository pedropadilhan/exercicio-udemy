package condicionais;
import java.util.Scanner;

public class cond02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		sc.close();
	}

}

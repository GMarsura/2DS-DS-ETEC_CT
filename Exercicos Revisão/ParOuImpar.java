
import java.util.Scanner;
public class ParOuImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		boolean p = n % 2 == 0;
		if(p) {
			System.out.println("Número Par");
		}else {
			System.out.println("Número impar");
		}
	}
	
}

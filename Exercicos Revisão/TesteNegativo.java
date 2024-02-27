
import java.util.*;
public class TesteNegativo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n1;
		
		n1 = in.nextInt();
		
		boolean p = n1 < 0;
		if(p) {
			System.out.println(n1+" é negativo");
		}else {
			System.out.println(n1+" é positivo");
		}
				
	}
}

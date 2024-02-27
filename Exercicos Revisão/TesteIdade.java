import java.util.*;
import java.time.LocalDate;
import java.util.*;
public class TesteIdade {
	public static void main(String[] args) {
	
			while(calcular().equalsIgnoreCase("sim")) {
				
			}
	}
	
	public static String calcular() {
		Scanner in = new Scanner(System.in);
		LocalDate data = LocalDate.now();
		int anoN, anoA;
		System.out.println("ano de nascimento");
		anoN = in.nextInt();
		anoA = data.getYear();
		boolean p = anoA - anoN > 18;
		if(p) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		
		System.out.println("Quer refazer o progama");
		String resposta = in.next();
		return resposta;
		
	}
}

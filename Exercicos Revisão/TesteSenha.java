
import java.util.*;
public class TesteSenha {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String senha = in.next();
		boolean v = senha.equals("2002");
		while(!v) {
			System.out.println("Senha Invalida \nTente novamente");
			senha = in.next();
			v = senha.equals("2002");
		}
		System.out.println("Acesso permitido");
		
		
	}
	
}

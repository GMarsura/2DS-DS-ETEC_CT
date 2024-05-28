package biblioteca;
import classes.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Livro livro = new Livro();
		System.out.println("Quer exibir a editora? (s) ou (n)");
		String resp = in.next();
		if(resp.equalsIgnoreCase("s")) {
			livro.exibirDetalhes();;
		}else {
			livro.exibirDetalhes();
		}
		Revista revista = new Revista();
		System.out.println("Quer exibir o mes? (s) ou (n)");
		String resp2 = in.next();
		if(resp2.equalsIgnoreCase("s")) {
			revista.exibirDetalhes();;
		}else {
			revista.exibirDetalhes();
		}
	}
	
}

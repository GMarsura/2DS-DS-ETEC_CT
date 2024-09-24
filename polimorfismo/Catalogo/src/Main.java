import classes.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Conteudo> catalogo = new ArrayList<>();
		
		
		
		
		
		for(String resp = "n"; resp.equalsIgnoreCase("s"); resp = in.next()) {
			
			System.out.println("Você quer cadastrar um Filme(f) ou uma serie(s). Digite (f) ou (s)");
			String des = in.next();
			
			if(des.equalsIgnoreCase("f")) {
				catalogo.add(criarFilme());
				
			}else if(des.equalsIgnoreCase("s")) {
				catalogo.add(criarSerie());
			}else {
				System.out.println("Valor invalido, tente novamente");
				continue;
			}
			
			
			
			System.out.println("Deseja cadastrar uma nova serie ou filme? (s) para sim ou (n) para não:");
			}
		
		
		
		for (Conteudo conteudo : catalogo) {
		    conteudo.exibir(); // Chama o método exibir de cada objeto
		}
		
			
	}
	
	
	
	
	public static Serie criarSerie() {
		System.out.println("Insira a categoria :");
		String categoria = in.next();
		
		System.out.println("Insira a Titulo :");
		String titulo = in.next();
		
		System.out.println("Insira a Duração em segundos :");
		int duracao = in.nextInt();
		
		
		System.out.println("Insira a quantidade de temporadas :");
		int qtdTemps = in.nextInt();
		
		System.out.println("Insira a quantidade de episodios por temporada:");
		int qtdEps = in.nextInt();
		
		
		
		
		Serie serie = new Serie(categoria, titulo, duracao, qtdEps, qtdTemps);
		return serie;
	}
	
	public static Filme criarFilme() {
		System.out.println("Insira a categoria :");
		String categoria = in.next();
		
		System.out.println("Insira a Titulo :");
		String titulo = in.next();
		
		System.out.println("Insira a Duração em segundos :");
		int duracao = in.nextInt();
		
		Filme filme = new Filme(categoria, titulo, duracao);
		return filme;
	}
}

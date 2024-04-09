import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		ArrayList<Filme> filmes = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		String resp = "s";
		
		while(resp.equalsIgnoreCase("s")) {
			filmes.add(cadastrarNovoFilme());
			System.out.println("Deseja cadastrar um novo filme?(S) para sim e (N) para não.");
			resp = in.next();
			i++;
		}
		
		System.out.println("Os Filmes cadastrados foram:");
		
		for(int j = 0; j < filmes.size(); j++) {
			String nome = filmes.get(j).getNome();
			int duracao = filmes.get(j).getDuracao();
			int [] tempo = filmes.get(j).exibirDuracaoEmHora();
			
			System.out.println("Filme: "+nome+", duração: "+tempo[0]+"h"+tempo[1]+", tempo em min: "+duracao);
		}
		System.out.print("Programa encerrado!");
	}
	public static Filme cadastrarNovoFilme() {
		String nome;
		
		
		Scanner in = new Scanner(System.in);
		
		Filme filmes = new Filme();
		
		System.out.println("Insira o nome do filme");
		filmes.setNome(in.next());
		nome = filmes.getNome();
		
		System.out.println("Insira o tempo de duração do filme em minutos: Exemplo(90) para um filme de 1h30");
		filmes.setDuracao(in.nextInt());
		
		
		int[] tempo = filmes.exibirDuracaoEmHora();
		System.out.println("O filme "+nome+" tem "+ tempo[0]+"h e "+tempo[1]+"m");
		
		
		return filmes;
	}
}

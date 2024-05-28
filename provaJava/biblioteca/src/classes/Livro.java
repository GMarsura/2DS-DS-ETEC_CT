package classes;
import java.util.Scanner;
public class Livro extends Publicacao {
	
	private int numPaginas;
	private String editora;
	
	
	//construtor
	
	public Livro() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual � o titulo da obra?");
		super.setTitulo(in.next());
		System.out.println("Qual � o nome do autor da obra?");
		super.setNomeAutor(in.next());
		System.out.println("Qual � o ano de publica��o da obra?");
		super.setAnoPublicacao(in.nextInt());
		System.out.println("Qual � a editora da obra?");
		editora = in.next();
		System.out.println("Qual � o numero de paginas da obra?");
		numPaginas = in.nextInt();
	}
	
	
	//sobrescrita de exibirDetalhes
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Titulo : "+super.getTitulo());
		System.out.println("Nome do autor: "+super.getNomeAutor());
		System.out.println("Ano de publica��o : "+getAnoPublicacao());
		System.out.println("Editora : "+editora);
		System.out.println("Numero de paginas : "+numPaginas);
	}
	 // sobrecarga
	public void exibirDetalhes(boolean vel) {
		System.out.println("Titulo : "+super.getTitulo());
		System.out.println("Nome do autor: "+super.getNomeAutor());
		System.out.println("Ano de publica��o : "+getAnoPublicacao());
		System.out.println("Numero de paginas : "+numPaginas);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Getters e Setters
	
	//numero de paginas
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	//editora
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
}

package classes;
import java.util.Scanner;


public class Revista extends Publicacao{
	private int numEdicao;
	private String mesPublicacao;
	
	
	
	//contrutor
	public Revista() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual é o titulo da obra?");
		super.setTitulo(in.next());
		System.out.println("Qual é o nome do autor da obra?");
		super.setNomeAutor(in.next());
		System.out.println("Qual é o ano de publicação da obra?");
		super.setAnoPublicacao(in.nextInt());
		System.out.println("Qual é o numero de edição?");
		numEdicao = in.nextInt();
		System.out.println("Qual é o mes de publicação?");
		mesPublicacao= in.next();
	}


	//getters e setters
	
	//numero da edição
	public int getNumEdicao() {
		return numEdicao;
	}



	public void setNumEdicao(int numEdicao) {
		this.numEdicao = numEdicao;
	}


	//mes da publicação
	public String getMesPublicacao() {
		return mesPublicacao;
	}



	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}
	
	
	//sobrescrita de exibirDetalhes
	
		@Override
		public void exibirDetalhes() {
			System.out.println("Titulo : "+super.getTitulo());
			System.out.println("Nome do autor: "+super.getNomeAutor());
			System.out.println("Ano de publicação : "+getAnoPublicacao());
			System.out.println("Numero de edição : "+numEdicao);
			System.out.println("Mes da publicação : "+mesPublicacao);
		}
		 // sobrecarga
		public void exibirDetalhes(boolean vel) {
			System.out.println("Titulo : "+super.getTitulo());
			System.out.println("Nome do autor: "+super.getNomeAutor());
			System.out.println("Ano de publicação : "+getAnoPublicacao());
			System.out.println("Numero de edição : "+numEdicao);
		}
	
	
	
}

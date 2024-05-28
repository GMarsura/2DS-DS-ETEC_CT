package classes;
import java.util.Scanner;


public class Revista extends Publicacao{
	private int numEdicao;
	private String mesPublicacao;
	
	
	
	//contrutor
	public Revista() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual � o titulo da obra?");
		super.setTitulo(in.next());
		System.out.println("Qual � o nome do autor da obra?");
		super.setNomeAutor(in.next());
		System.out.println("Qual � o ano de publica��o da obra?");
		super.setAnoPublicacao(in.nextInt());
		System.out.println("Qual � o numero de edi��o?");
		numEdicao = in.nextInt();
		System.out.println("Qual � o mes de publica��o?");
		mesPublicacao= in.next();
	}


	//getters e setters
	
	//numero da edi��o
	public int getNumEdicao() {
		return numEdicao;
	}



	public void setNumEdicao(int numEdicao) {
		this.numEdicao = numEdicao;
	}


	//mes da publica��o
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
			System.out.println("Ano de publica��o : "+getAnoPublicacao());
			System.out.println("Numero de edi��o : "+numEdicao);
			System.out.println("Mes da publica��o : "+mesPublicacao);
		}
		 // sobrecarga
		public void exibirDetalhes(boolean vel) {
			System.out.println("Titulo : "+super.getTitulo());
			System.out.println("Nome do autor: "+super.getNomeAutor());
			System.out.println("Ano de publica��o : "+getAnoPublicacao());
			System.out.println("Numero de edi��o : "+numEdicao);
		}
	
	
	
}

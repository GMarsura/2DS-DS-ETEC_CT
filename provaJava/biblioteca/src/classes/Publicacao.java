package classes;
import java.util.Scanner;

public class Publicacao {
	private String titulo, nomeAutor;
	private int anoPublicacao;
	

	// Getters e Setters:

	
	
	// titulo
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	// nome
	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	//ano de publicação
	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	
	// outros metodos
	public void exibirDetalhes() {
		System.out.println("Titulo : "+titulo+"\nNome do autor: "+nomeAutor+"\nAno de publicação : "+anoPublicacao);
	}
	
	
}

package classes;

import javax.management.remote.SubjectDelegationPermission;

public class Filme extends Conteudo {
	private int duracao;

	public Filme(String categoria, String titulo, int duracao) {
		super(categoria, titulo);
		this.duracao = duracao;
	}

	public int getDuracao() {
		int minutos = duracao/60;
		int horas = (minutos/60)%60;
		duracao = duracao%60;
		minutos = minutos%60;
		
		String tempo = horas+" horas, "+minutos+ "minutos e "+duracao+" segundos";
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public void exibir() {
        super.exibir(); // Chama o método da superclasse
        System.out.println("Tempo :"+ getDuracao());
    }
}

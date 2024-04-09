
public class Filme {
	private String nome;
	private int duracao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
	public int[] exibirDuracaoEmHora() {
		int tempoHora = (int)getDuracao()/60;
		int restoMin = (int)getDuracao()%60;
		int [] tempo = {tempoHora, restoMin};
		return tempo;
	}
}

package classes;

public class Serie extends Conteudo{
	private int duracao, qtdEps, qtsTemps;

	public Serie(String categoria, String titulo, int duracao, int qtdEps, int qtdTemps) {
		super(categoria, titulo);
		this.duracao = duracao;
		this.qtdEps = qtdEps;
		this.qtsTemps = qtdTemps;
		
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

	public int getQtdEps() {
		return qtdEps;
	}

	public void setQtdEps(int qtdEps) {
		this.qtdEps = qtdEps;
	}

	public int getQtsTemps() {
		return qtsTemps;
	}

	public void setQtsTemps(int qtsTemps) {
		this.qtsTemps = qtsTemps;
	}
	
	public void exibir() {
        super.exibir(); // Chama o método da superclasse
        System.out.println("Duração: "+ getDuracao());
        System.out.println("Quantidade de Episódios: " + this.qtdEps);
        System.out.println("Quantidade de Temporadas: " + this.qtsTemps);
    }
}

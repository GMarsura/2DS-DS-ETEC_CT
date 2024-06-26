package tarefaDeFixacao;
public class Carro extends Veiculo{
	double percentual;
	
	

	public Carro(String modelo, String cor, String combustivel, double valorTabela, double ipva, double percentual) {
		super(modelo, cor, combustivel, valorTabela, ipva);
		this.percentual = percentual;
	}

		
	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	
}

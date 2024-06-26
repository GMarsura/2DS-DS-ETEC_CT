package tarefaDeFixacao;
public class Carro extends Veiculo{
	private double percentual;
	
	
	
	public Carro(String modelo, String cor, String combustivel, double valorTabela,double percentual) {
		super(modelo, cor, combustivel, valorTabela, percentual);
		this.percentual = percentual;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Percentual do ipva: "+ percentual+ ";");
	}
		
	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	
}

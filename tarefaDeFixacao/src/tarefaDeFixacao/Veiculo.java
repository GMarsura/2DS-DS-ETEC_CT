package tarefaDeFixacao;

public class Veiculo {
	private String modelo, cor, combustivel;
	private double valorTabela, ipva;
	
	
	public Veiculo(String modelo, String cor, String combustivel, double valorTabela, double percentual) {
		this.modelo = modelo;
		this.combustivel = combustivel;
		this.cor = cor;
		calcularIpva(percentual);
		this.valorTabela = valorTabela;
	}
	
	public void imprimir() {
		System.out.println("Modelo: " + modelo + ";");
		System.out.println("Cor: " + cor + ";");
		System.out.println("Combustivel: " + combustivel + ";");
		System.out.println("valorTabela: " + valorTabela + ";");
		System.out.println("ipva: " + ipva + ";");
	}
	public void calcularIpva(double percentual) {
		this.ipva = valorTabela * (percentual/100);
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public double getValorTabela() {
		return valorTabela;
	}
	public void setValorTabela(double valorTabela) {
		this.valorTabela = valorTabela;
	}
	public double getIpva() {
		return ipva;
	}
	public void setIpva(double ipva) {
		ipva = ipva;
	}
	
}

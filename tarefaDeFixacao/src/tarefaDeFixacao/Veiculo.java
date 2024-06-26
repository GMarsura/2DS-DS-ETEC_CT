package tarefaDeFixacao;
import java.util.Scanner;
public class Veiculo {
	private String modelo, cor, combustivel;
	private double valorTabela, ipva;
	
	
	public Veiculo(String modelo, String cor, String combustivel, double valorTabela, double ipva) {
		this.modelo = modelo;
		this.combustivel = combustivel;
		this.cor = cor;
		this.ipva = ipva;
		this.valorTabela = valorTabela;
	}
	
	
	public double calcularIpva(double percentual) {
		return ipva = valorTabela * (percentual/100);
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

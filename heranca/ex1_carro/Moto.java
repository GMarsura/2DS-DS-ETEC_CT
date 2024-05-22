package ex1_carro;

public class Moto extends Veiculo{
	private String cilindrada;
	
	public Moto(){
		super.setMarca("Honda");
		super.setModelo("Biz 125");
		super.setAno(2024);
		super.setCor("Vermelho");
		setCilindrada("124,9cc");
		
		System.out.println("Marca: " + super.getMarca());
		System.out.println("Modelo: "+ super.getModelo());
		System.out.println("Ano: " + super.getAno());
		System.out.println("Cor: "+ super.getCor());
		System.out.println("Cilindrada: " + getCilindrada());
	}

	// GETTERS AND SETTERS
	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
}
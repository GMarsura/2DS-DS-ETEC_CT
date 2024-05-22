package ex1_carro;

public class Carro extends Veiculo{
	private byte qntdPorta;

	public Carro(){
		super.setMarca("Tesla");
		super.setModelo("Model S");
		super.setAno(2017);
		super.setCor("Vermelho");
		setQntdPorta((byte) 4);
		
		System.out.println("Marca: " + super.getMarca());
		System.out.println("Modelo: "+ super.getModelo());
		System.out.println("Ano: " + super.getAno());
		System.out.println("Cor: "+ super.getCor());
		System.out.println("Cilindrada: " + getQntdPorta());
	}
	// GETTERS AND SETTERS
	public byte getQntdPorta() {
		return qntdPorta;
	}

	public void setQntdPorta(byte qntdPorta) {
		this.qntdPorta = qntdPorta;
	}
}
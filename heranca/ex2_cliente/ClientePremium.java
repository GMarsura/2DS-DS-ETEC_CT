package ex2_cliente;

public class ClientePremium extends Cliente {
    @Override
    public void calcularDesconto() {
        double desconto = this.getValor_pedido() * 0.15;
        this.setValor_promocional(this.getValor_pedido() - desconto);
    }

    public ClientePremium(String nome, byte idade, String endereco, double valor_pedido) {
        super(nome, idade, endereco, valor_pedido);
        calcularDesconto();
    }
}
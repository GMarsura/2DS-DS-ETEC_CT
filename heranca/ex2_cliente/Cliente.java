package ex2_cliente;

public class Cliente{
    private String nome;
    private byte idade;
    private String endereco;
    private double valor_pedido;
    private double valor_promocional;

    //CONSTRUCTOR

    public Cliente(String nome, byte idade, String endereco, double valor_pedido) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.valor_pedido = valor_pedido;
    }
    public Cliente() {
        
    }
    
    //CALCULAR DESCONTO
    public void calcularDesconto() {
        double desconto = this.valor_pedido * 0.10;
        this.valor_promocional = this.valor_pedido - desconto;
    }

    //GET AND SET
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }


    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor_pedido() {
        return valor_pedido;
    }

    public void setValor_pedido(double valor_pedido) {
        this.valor_pedido = valor_pedido;
    }

    public double getValor_promocional() {
        return valor_promocional;
    }

    public void setValor_promocional(double valor_promocional) {
        this.valor_promocional = valor_promocional;
    }
    
}   
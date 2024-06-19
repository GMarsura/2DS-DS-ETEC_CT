package classes;

public class Jogo {
    private String nome, distribuidora;
    private double preco;

    public Jogo(String nome, String distribuidora, double preco) {
        this.nome = nome;
        this.distribuidora = distribuidora;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.print("Nome: " + nome + "; ");
        System.out.print("Distribuidora: " + distribuidora + "; ");
        System.out.println("Preço: " + preco + "; ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

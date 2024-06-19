package classes;

public class JogoEletronico extends Jogo {
    private String plataforma, genero;
    private int qtdJogadores;

    public JogoEletronico(String nome, String distribuidora, double preco, String plataforma, String genero) {
        super(nome, distribuidora, preco);
        this.plataforma = plataforma;
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void jogarOnline(int qtdJogadores) {
        this.qtdJogadores = qtdJogadores;
        System.out.println("Online com " + qtdJogadores + " jogadores!");
    }

    public void exibir() {
        super.exibirInformacoes();
        System.out.print("Plataforma: " + plataforma + "; ");
        System.out.print("Gênero: " + genero + "; ");
        System.out.println("Quantidade de jogadores online: " + qtdJogadores + "; ");
    }
}

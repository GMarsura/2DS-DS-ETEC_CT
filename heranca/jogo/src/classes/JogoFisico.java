package classes;

public class JogoFisico extends Jogo {
    private int qtdJogadores, tempo, qtdPartidas;

    public JogoFisico(String nome, String distribuidora, double preco, int qtdJogadores, int tempo) {
        super(nome, distribuidora, preco);
        this.qtdJogadores = qtdJogadores;
        this.tempo = tempo;
    }

    public int getQtdJogadores() {
        return qtdJogadores;
    }

    public void setQtdJogadores(int qtdJogadores) {
        this.qtdJogadores = qtdJogadores;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void calcularTempo(int qtdPartidas) {
        this.qtdPartidas = qtdPartidas;
        int totalTempo = tempo * qtdPartidas;
        int s = totalTempo;
        int m = s / 60;
        int h = m / 60;
        int d = h / 24;

        s = s % 60;
        m = m % 60;
        h = h % 24;

        System.out.println("Tempo total: " + d + " dias " + h + " horas " + m + " minutos " + s + " segundos");
    }

    public void exibir() {
        super.exibirInformacoes();
        System.out.print("Quantidade de jogadores: " + qtdJogadores + "; ");
        System.out.print("Quantidade de partidas: " + qtdPartidas + "; ");
        calcularTempo(qtdPartidas);
    }
}

import java.util.Scanner;
import classes.*;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static JogoEletronico jogoEletronico;
    private static JogoFisico jogoFisico;

    public static void main(String[] args) {
        criarJogoEletronico();
        criarJogoFisico();
        exibirInformacoes();
    }

    public static void criarJogoEletronico() {
        System.out.println("Informe os dados do jogo eletronico:");
        System.out.println("Nome: ");
        String nome = in.next();
        System.out.println("Distribuidora: ");
        String distribuidora = in.next();
        System.out.println("Plataforma: ");
        String plataforma = in.next();
        System.out.println("Gênero: ");
        String genero = in.next();
        System.out.println("Preço: ");
        double preco = in.nextDouble();

        jogoEletronico = new JogoEletronico(nome, distribuidora, preco, plataforma, genero);

        System.out.println("Quantos jogadores online esse jogo vai ter?");
        int qtdJogadores = in.nextInt();
        jogoEletronico.jogarOnline(qtdJogadores);
    }

    public static void criarJogoFisico() {
        System.out.println("Informe os dados do jogo fisico:");
        System.out.println("Nome: ");
        String nome = in.next();
        System.out.println("Distribuidora: ");
        String distribuidora = in.next();
        System.out.println("Quantidade de jogadores: ");
        int qtdJogadores = in.nextInt();
        System.out.println("Tempo por partida (minutos): ");
        int tempo = in.nextInt();
        System.out.println("Preço: ");
        double preco = in.nextDouble();

        jogoFisico = new JogoFisico(nome, distribuidora, preco, qtdJogadores, tempo);

        System.out.println("Quantas partidas você deseja jogar?");
        int qtdPartidas = in.nextInt();
        jogoFisico.calcularTempo(qtdPartidas);
    }

    public static void exibirInformacoes() {
        System.out.println("\nJogo Eletrônico:");
        jogoEletronico.exibir();

        System.out.println("\nJogo Físico:");
        jogoFisico.exibir();
    }
}

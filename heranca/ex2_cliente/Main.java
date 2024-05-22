package ex2_cliente;

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("Insira:");
        System.out.println("Nome:");
        String nome = in.next();

        System.out.println("Idade:");
        byte idade = in.nextByte();

        System.out.println("Endereço:");
        String endereco = in.next();

        System.out.println("Valor:");
        double valor = in.nextDouble();
        
        Cliente cliente = new Cliente(nome,  idade,  endereco,  valor);
        ClientePremium clientePremium = new ClientePremium(nome,  idade,  endereco,  valor);

        System.out.println("É cliente premium (s/n)?");
        String verifyCliente = in.next();

        if (verifyCliente.equalsIgnoreCase("s")) {
            cliente.calcularDesconto();
            System.out.printf("Valor: %.2f%n", cliente.getValor_promocional());
        } else {
            clientePremium.calcularDesconto();
            System.out.printf("Valor: %.2f%n", clientePremium.getValor_promocional());
        }
        in.close();
    }
}
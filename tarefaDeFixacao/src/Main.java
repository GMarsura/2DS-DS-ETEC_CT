import tarefaDeFixacao.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<>();
		ArrayList<Moto> motos = new ArrayList<>();
		
		String resp = "s";
		
		while(resp.equalsIgnoreCase("s")) {
			System.out.println("Quer instanciar uma moto ou um carro? (c) para carro, (m) para moto");
			String d = in.next();
			if(d.equalsIgnoreCase("c")) {
				carros.add(gerarCarro());
			}else if(d.equalsIgnoreCase("m")) {
				motos.add(gerarMoto());
			}else {
				System.out.println("Decisão invalida!");
				System.exit(0);
			}
			
			System.out.println("Deseja cadastrar um novo Veiculo?(S) para sim e (N) para não.");
			resp = in.next();
			
			
			
		}
		System.err.println("Ficha de todos os carros:");
		for(int j = 0; j < carros.size(); j++) {
			System.out.println("Carro "+ (j+1) + ";");
			carros.get(j).imprimir();
			System.out.println("-----------------------------------------------------------");
		}
		
		System.err.println("Ficha de todas as Motos:");
		for(int j = 0; j < motos.size(); j++) {
			System.out.println("Moto "+ (j+1) + ";");
			motos.get(j).imprimir();
			System.out.println("-----------------------------------------------------------");
		}
		
	}
	
	public static Carro gerarCarro() {
		String a,b,c;
		double n1;
		System.out.println("Qual é o modelo?");
		a = in.next();
		System.out.println("Qual que é a cor?");
		b = in.next();
		System.out.println("Qual que é o tipo do combustivel?");
		c = in.next();
		System.out.println("Qual que é o valor de tabela?");
		n1 = in.nextDouble();
		
		Carro carro = new Carro(a, b, c , n1, 4);
		return carro;
	
	
	}
	
	public static Moto gerarMoto() {
		String a,b,c;
		double n1;
		System.out.println("Qual é o modelo?");
		a = in.next();
		System.out.println("Qual que é a cor?");
		b = in.next();
		System.out.println("Qual que é o tipo do combustivel?");
		c = in.next();
		System.out.println("Qual que é o valor de tabela?");
		n1 = in.nextDouble();
		
		Moto moto = new Moto(a, b, c , n1, 2);
		return moto;
	}
}

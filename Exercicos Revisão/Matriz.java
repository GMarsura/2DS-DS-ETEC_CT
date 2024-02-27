
import java.util.*;
public class Matriz {
	public static void main(String[] args) {
		criar();
	}
	public static void criar() {
		double[][] notas = new double [3][4];
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
			int v = i + 1;
			System.out.println("Insira as notas do aluno "+v);
			for(int j = 0; j < 4 ; j++) {
				int n = j+1;
				System.out.println("Nota "+n);
				notas[i][j] = in.nextDouble();
			}
		}
		for(int i = 0; i<3;i++) {
			int v = i+1;
			System.out.print("Nota do aluno "+v+":");
			for(int j = 0; j<4;j++) {
				System.out.print("{"+notas[i][j]+"};");
			}
			System.out.println();
		}
	}
}

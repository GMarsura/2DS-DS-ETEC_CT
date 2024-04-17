import classes.Calc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Você quer somar ou subtrair?(+) ou (-)");
        String resp = in.next();
        Calc calc = new Calc();

        if(resp.equals("-")) {
            System.out.println("Numeros com decimais ou sem decimais?(d) ou (n)");
            String resp2 = in.next();
            if(resp2.equalsIgnoreCase("d")) {
                subDouble(calc, in);
            } else {
                subInt(calc, in);
            }
        } else {
            System.out.println("Numeros com decimais ou sem decimais?(d) ou (n)");
            String resp2 = in.next();
            if(resp2.equalsIgnoreCase("d")) {
                somDouble(calc, in);
            } else {
                somInt(calc, in);
            }
        }
    }

    public static void subInt(Calc calc, Scanner in) {
        String resp = "n";
        do {
            System.out.println("Entre com um numero");
            calc.setNumI(in.nextInt());
            System.out.println("Adicionar novo numero a subtração(s) ou (n)");
            resp = in.next();
        } while(!resp.equalsIgnoreCase("n"));
        System.out.println("A subtração de todos os seus produtos é " + calc.subInt());
    }

    public static void subDouble(Calc calc, Scanner in) {
        String resp = "n";
        do {
            System.out.println("Entre com um numero");
            calc.setNumD(in.nextDouble());
            System.out.println("Adicionar novo numero a subtração(s) ou (n)");
            resp = in.next();
        } while(!resp.equalsIgnoreCase("n"));
        System.out.println("A subtração de todos os seus produtos é " + calc.subDouble());
    }

    public static void somInt(Calc calc, Scanner in) {
        String resp = "n";
        do {
            System.out.println("Entre com um numero");
            calc.setNumI(in.nextInt());
            System.out.println("Adicionar novo numero a soma(s) ou (n)");
            resp = in.next();
        } while(!resp.equalsIgnoreCase("n"));
        System.out.println("A soma de todos os seus produtos é " + calc.somaInt());
    }

    public static void somDouble(Calc calc, Scanner in) {
        String resp = "n";
        do {
            System.out.println("Entre com um numero");
            calc.setNumD(in.nextDouble());
            System.out.println("Adicionar novo numero a soma(s) ou (n)");
            resp = in.next();
        } while(!resp.equalsIgnoreCase("n"));
        System.out.println("A soma de todos os seus produtos é " + calc.somaDouble());
    }
}

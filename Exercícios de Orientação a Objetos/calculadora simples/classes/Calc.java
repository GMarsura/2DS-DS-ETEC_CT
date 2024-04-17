package classes;
import java.util.ArrayList;

public class Calc {
    ArrayList<Integer> numI = new ArrayList<>();
    ArrayList<Double> numD = new ArrayList<>();

    // int
    public ArrayList<Integer> getNumI() {
        return numI;
    }

    public void setNumI(int numI) {
        this.numI.add(numI);
    }

    // double
    public ArrayList<Double> getNumD() {
        return numD;
    }

    public void setNumD(double numD) {
        this.numD.add(numD);
    }

    // função soma
    public int somaInt() {
        int cont = 0;
        for(int i = 0; i < numI.size(); i++) {
            cont += numI.get(i);
        }
        return cont;
    }

    public double somaDouble() {
        double cont = 0;
        for(int i = 0; i < numD.size(); i++) {
            cont += numD.get(i);
        }
        return cont;
    }

    // função subtração
    public int subInt() {
        int cont = 0;
        for(int i = 0; i < numI.size(); i++) {
            cont -= numI.get(i);
        }
        return cont;
    }

    public double subDouble() {
        double cont = 0;
        for(int i = 0; i < numD.size(); i++) {
            cont -= numD.get(i);
        }
        return cont;
    }
}

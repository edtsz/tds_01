import java.util.Scanner;
public class calc2 {

    public static void main (String [] args) {

        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[2]);
        String ops = args[1];
        double res = 0;

        if (ops.equals("+")) {
            res = soma(n1, n2);
        }
        else if (ops.equals("-")) {
            res = sub
        }
        else {
            System.err.println("Erro.");
        }
        System.out.println(res);

    }

    public static double soma(double n1, double n2) {
        return n1 + n2;
    }
    public static double sub(double n1, double n2) {
        return n1 - n2;
    }
    public static double mult(double n1, double n2) {
        return n1 * n2;
    }
    public static double div(double n1, double n2) {
        return n1 / n2;
    }
}
public class calcObj {

    public static void main (String [] args) {

        double res = 0;
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[2]);
        String ops = args[1];

        switch (ops) {
            case "+" :
                res = soma(n1, n2);
                break;

            case "-" :
                res = sub(n1, n2);
                break;

            case "x" :
                res = mult(n1, n2);
                break;

            case "/" :
                res = div(n1, n2);
                break;

            default :
                System.err.println("Operação inválida.");
                break;
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
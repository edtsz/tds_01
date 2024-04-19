public class calc {

    public static void main (String [] args) {

        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[2]);
        double soma = n1 + n2; 
        double sub = n1 - n2;
        double mult = n1 * n2;
        double div = n1 / n2;
        String ops = args[1];

        switch (ops) {

            case "+" :
                System.out.println("O resultado é: " + soma);
            break;

            case "-" :
                System.out.println("O resultado é: " + sub);
            break;

            case "x" :
                System.out.println("O resultado é: " + mult);
            break;

            case "/" :
                System.out.println("O resultado é: " + div);
            break;

            default :
                System.err.println("Operação inválida");
            break;
        }
   }
}
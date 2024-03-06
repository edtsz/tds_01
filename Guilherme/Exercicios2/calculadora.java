import java.util.Scanner;
public class calculadora {

    public static void main (String [] args) {

        int soma , sub , multi ;
        double div;
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[2]);
        String ops = "";

        Scanner scan = new Scanner (System.in);
        System.out.println("Bem-vindo. Vamos fazer umas conta aí");
        ops = scan.nextLine();

        if (ops.equals(" + ")) {
            System.out.println("O resultado é: " + (n1 + n2));
        }
        else if (ops.equals(" - ")) {
            System.out.println("O resultado é: " + (n1 - n2));
        }
        else if (ops.equals(" x ")){
            System.out.println("O resultado é: " + (n1 * n2));
        }
        else if (ops.equals(" / ")) {
            System.out.println("O resultado é: " + (n1 / n2));
        }
        
   }
}
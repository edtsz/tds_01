import java.util.Scanner;

public class calc {

    public static void main (String [] args) {
        while (true) {
            Scanner scan = new Scanner (System.in);

            System.out.println("Digite o primeiro número: ");
            double n1 = Double.parseDouble(scan.nextLine());
            if (n1 == 0 ) {
                break;
            }
            System.out.println("Digite o segundo número: ");
            double n2 = Double.parseDouble(scan.nextLine());
            double res = 0;
            System.out.println("Digite a operação que tu queres: ");
            String ops = scan.nextLine();

            switch (ops) {
                case "+" : 
                    res = n1 + n2;
                    break;
                case "-" :
                    res = n1 - n2;
                    break;
                case "/" :
                    res = n1 / n2;
                    break;
                case "x" : 
                    res = n1 * n2;
                    break;
            }
            System.out.println(res);
        }
    }
}
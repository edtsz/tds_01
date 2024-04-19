/*média*/
public class ex02 {

    public static void main (String [] args) {

        float qtdnum = args.length;
        int total = 0;

        for (int i = 0 ; i < args.length ; i++) {
        total = total + Integer.parseInt(args[i]);
        }

        double media = (double) total / qtdnum ;

        System.out.println("Total é " + total);
        System.out.println("A média é: " + media);
        
    }
}
/* número par ou ímpar */
public class ex03 {

    public static void main (String [] args) { 
        int par = 0;
        int impar = 1;

        for ( int i = 0 ; i < args.length ; i++) {
            int numero = Integer.parseInt(args[i]);
            if ( numero % 2 == 0 ) {
                System.out.println("Par.");
            }
            else {
                System.out.println("Ímpar.");
            }

        }
    }
}
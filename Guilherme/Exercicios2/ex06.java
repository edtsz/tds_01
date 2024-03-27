/*números primos*/
public class ex06 {

    public static void main (String [] args) {

        int numero = Integer.parseInt(args[0]);
        int vez = 0;

        for (int i = 0 ; i < numero ; i++) {
            vez++;
            
            if (numero < 2) {
                System.out.println("Não é primo.");
            }
            else {
                for (int j = 2 ; j < numero ; j++) {
                    if (numero % j == 0) {
                    vez++;
                    System.out.println("Não é primo.");
                    break;
                    }
                }
                if ( vez == 0 ) {
                    System.out.println("É primo.");
                }
            }
        }
    }
}
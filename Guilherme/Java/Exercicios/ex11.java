/*pascal case, primeira letra de cada String maiúscula, o resto que se exploda*/
public class ex11 {

    public static void main (String [] args ) {
        
        for (int i = 0; i < args.length; i++) {

            String primcar = args[i].substring(0,1).toUpperCase();
            String restcar = args[i].substring(1).toLowerCase();
            String frase = primcar + restcar;

            System.out.print(frase);
        }
    }
}
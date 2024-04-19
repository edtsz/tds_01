/*exercício que eu esqueci de fazer, daí tentei fazer agora a pouco, mas esqueci de novo */
public class ex04_2 {

    public static void main (String [] args ) {

        for (int p=args.length-1; p >=0; p--) {

            for ( int i = args[p].length() - 1; i >=0; i-- ) {
                System.out.println(args[p].chartAt(i));

            }
        }
    }
}
/*snake_case*/
public class ex08 {

    public static void main (String [] args) {

        for ( int a = 0; a < args.length; a++) {
            System.out.print( args[a]);

            if ( a < args.length -1 ) {
                    System.out.print("_");
            }
        }
    }
}
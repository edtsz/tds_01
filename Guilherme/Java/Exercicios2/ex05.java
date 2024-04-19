/*fatorial*/
public class ex05 {

    public static void main (String [] args) {

        int n = Integer.parseInt(args[0]);
        double resultado = 1;

        for ( int i = 1 ; i <= n ; i++) {

            resultado *= i;
        }
        System.out.println(resultado);
           
    }  
}        

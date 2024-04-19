/*Sequência de Fibonacci*/
public class ex08 {

    public static void main (String [] args) {

        int atual = Integer.parseInt(args[0]);
        int antes = atual - 1;
        int resultado = atual + antes;
        System.out.println(resultado);
    }
}
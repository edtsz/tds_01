/*somar*/
public class ex01 {

    public static void main (String [] args) {

        int total = 0;
        for (int i = 0 ; i < args.length ; i++) {
        total = total + Integer.parseInt(args[i]);
        }
        System.out.println("O total é " + total);
        
    }
}
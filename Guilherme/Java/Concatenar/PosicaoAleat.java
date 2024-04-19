import java.util.Arrays;
import java.util.Random;


class PosicaoAleat {

    public static void main (String [] args){

        Random rm = new Random();
        String a = (Arrays.deepToString(args));
        System.out.println(a);
        String b = a;
        System.out.println(a.charAt(rm.nextInt(a.length()-1)));
        System.out.println(b.charAt(rm.nextInt(b.length()-1)));
        System.out.println(a);
        System.out.println(b);

    }
}

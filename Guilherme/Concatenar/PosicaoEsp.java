import java.util.Arrays;

public class PosicaoEsp{

    public static void main (String [] args ){
       Integer letraPos = Integer.parseInt(args[0]);
       String a = args [1];
       System.out.println(a.charAt(letraPos - 1));
    }


}
public class ex04_1 {

    public static void main (String [] args) {

        String pinv = args[0];
        
        for(int i = pinv.length()-1; i>=0; i --) {
            System.out.print(pinv.charAt(i));
        }
    }
}
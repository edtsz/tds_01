public class ex04 {
    public static void main (String [] args ) {
        String pinv = args[0];
        String reverse = new StringBuffer(pinv).reverse().toString();
        System.out.println(reverse);
    }
}
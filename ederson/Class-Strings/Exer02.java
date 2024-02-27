public class Exer02 {
    public static void main(String[] args) {
        int total = 0;
        
        for (int i = 0; i < args.length; i++) {
            total += args[i].length();
        }
        System.out.println("A string " + String.join("", args) + " possui " + total + " letras.");
    }
}

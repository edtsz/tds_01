public class Exer06 {
    public static void main(String[] args) {
        String finalString = "";
        
        for (int wordIndex = 0; wordIndex < args.length; wordIndex++) {
            if (wordIndex > 0) {
                finalString += " ";
            }
            finalString += args[wordIndex].toUpperCase();
        }
 
        System.out.println(finalString);
    }
}

public class Exer05 {
    public static void main(String[] args) {
        String finalString = "";
        for (int wordIndex = args.length - 1; wordIndex >= 0; --wordIndex) {
            for(int charIndex = args[wordIndex].length() - 1; charIndex >= 0; charIndex--) {
                finalString += args[wordIndex].charAt(charIndex);
            }

            if (wordIndex > 0) {
                finalString += " ";
            }
        }
        System.out.println(finalString);
    }
}
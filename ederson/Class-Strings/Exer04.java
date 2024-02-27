public class Exer04 {
    public static void main(String[] args) {
        String word = "";
        for(int i = 0; i < args[0].length(); i++) {
            word = args[0].charAt(i) + word;
        }

        System.out.println(word);
    }
}

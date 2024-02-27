public class cowsay  {
    public static void main(String[] args)  {
        String userInput = String.join(" ", args);
        String lineAbove = "_".repeat(userInput.length() + 2);
        String lineBelow = "-".repeat(userInput.length() + 2);
        String spacer = " ".repeat((int) (userInput.length() / 2));

        System.out.println(" " + lineAbove);
        System.out.println("< "+ userInput +" >");
        System.out.println(" " + lineBelow);
        System.out.println(spacer + "\\   ^__^");
        System.out.println(spacer + " \\  (oo)\\_______");
        System.out.println(spacer + "    (__)\\       )\\/\\");
        System.out.println(spacer + "        ||----w |");
        System.out.println(spacer + "        ||     ||");
    }
}

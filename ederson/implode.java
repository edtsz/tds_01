public class implode {
    public static void main(String[] args) {
        int n = args.length;

        System.out.print("Padrão:  ");
        for (int i = 0; i < n; i++) {
            System.out.print(args[i]);
            if (i < n - 1) {
                System.out.print("-");
            }
        }
        System.out.println();

        System.out.print("Padrão:  ");
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print("-");
            }
            System.out.print(args[i]);
        }
        System.out.println();

        System.out.print("Glue:    ");
        String glue = "";
        for (int i = 0; i < n; i++) {
            System.out.print(glue + args[i]);
            glue = "-";
        }
        System.out.println();

        System.out.print("args[0]: ");
        System.out.print(args[0]);
        for (int i = 1; i< n; i++) {
            System.out.print("-" + args[i]);
        }
        System.out.println();

        System.out.print("args[i]: ");
        int i = 0;
        for (; i < n-1; i++) {
            System.out.print(args[i] + "-");
        }
        System.out.println(args[i]);


        System.out.println("Java:    " + String.join("-", args));
    }
}
 
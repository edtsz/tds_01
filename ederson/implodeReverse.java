public class implodeReverse {
    public static void main(String[] args) {
        int n = args.length;

        System.out.print("Padrão:  ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(args[i]);
            if (i > 0) {
                System.out.print("-");
            }
        }
        System.out.println();

        System.out.print("Padrão:  ");
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1) {
                System.out.print("-");
            }
            System.out.print(args[i]);
        }
        System.out.println();

        System.out.print("Glue:    ");
        String glue = "";
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(glue + args[i]);
            glue = "-";
        }
        System.out.println();

        System.out.print("args[0]: ");
        System.out.print(args[n-1]);
        for (int i = n - 2; i >= 0; i--) {
            System.out.print("-" + args[i]);
        }
        System.out.println();

        System.out.print("args[i]: ");
        int i = n-1;
        for (; i > 0; i--) {
            System.out.print(args[i] + "-");
        }
        System.out.println(args[0]);

    }
}

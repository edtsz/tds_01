public class exemploOrObj {

    public static void main (String [] args) {

        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[1]);
        
        if (args[1] == "+") {
            res = somar(n1, n1);
        }

    }

    public static double somar(double x , double y) {

        return x + y;
    }
}
import java.util.Scanner;

public class calcFunc {

    public static void main (String [] args) {
        
        double res = 0;
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[2]);
        String ops = args[1];

        Calcular calc = new Calcular(n1, n2);

        switch (ops) {
            case "+" :
                res = calc.somar();
                break;

            case "-" :
                res = calc.sub();
                break;

            case "x" :
                res = calc.mult();
                break;

            case "/" :
                res = calc.div();
                break;

            case "exp" :
                res = calc.exp();
                break;

            case "raiz" :
                res = calc.raiz();
                break;

            default :
                System.err.println("Operação inválida.");
                break;
       }
       System.out.println(res);

    }
}

class Calcular {

    private double n1;
    private double n2;

    Calcular(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double somar() {

        return this.n1 + this.n2 ;
    }
    public double sub() {

        return this.n1 - this.n2 ;
    }
    public double mult() {

        return this.n1 * this.n2 ;
    }
    public double div() {

        return this.n1 / this.n2 ;
    }
    public double exp() {

        return Math.pow(this.n1, this.n2) ;
    }
    public double raiz() {

        return Math.sqrt(this.n1) ;
    }
}

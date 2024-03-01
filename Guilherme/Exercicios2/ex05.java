/*fatorial*/
public class ex05 {

    public static void main (String [] args) {

            int n = Integer.parseInt(n.getValue().toString());
            int f = 1;
            int c = n;
            String s = "";

            while (c >= 1) {

                f *= c;
                if( c == 1) {
                    s += c ;
                }
                else if (c > 1) {
                    s += c + " x ";
                }
                c--;
            }  
            lblFat.setText(s + " = " + Integer.toString(f));
        }        
    }

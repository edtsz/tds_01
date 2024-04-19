public class nStrings{

    public static void main (String [] args ){
        for(int contador = 0 ; contador < args.length ; contador++){
            System.out.print(args[contador]);
        
        if ( contador < args.length - 1){
            System.out.print(" - ");
        }
        else if ( contador < args.length + 1) {
            System.out.println(" ");
        }
        }
    }
}
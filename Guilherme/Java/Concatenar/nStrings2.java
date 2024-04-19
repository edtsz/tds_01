class nStrings2 {

    public static void main (String [] args ){ 
        String grude = " ";
        for (int contador = 0; contador < args.length; contador++){
            System.out.print(grude + args[contador]);
            grude = " - " ;
        }
        System.out.println(" \n ");
    }
}
/*ler e imprimir uma frase sem as vogais*/ 
public class ex13 {

    public static void main (String [] args) {

        String saida = "";
        String frase = args[0];

        for (int i = 0; i < frase.length(); i++) {
            
            char c = frase.toLowerCase().charAt(i);
            if ( c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                saida += frase.charAt(i);
            }
        }
        System.out.println(saida);
    }
}
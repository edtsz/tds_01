import java.util.Scanner;

public class looj {

    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);
        compra compra = new compra();
        usuario usuario = new usuario();
        produto produto = new produto();

        
        System.out.println("Bom dia, vamos fazer tuas compras bagual veio: ");

        System.out.println("Me diza teu nome: ");
        usuario.setUsuario(scan.nextLine());

        System.out.println("Agora me dis teu e meiol");
        usario.setEmail(scan.nextLine());

        System.out.println("E tua senha (confia que não acontesse nada)");
        usuario.setSenha(scan.next());



    }
}
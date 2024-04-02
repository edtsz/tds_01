import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Looj {

    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);
        Compra compra = new Compra();
        Usuario usuario = new Usuario();
        Produto produto = new Produto();

        System.out.println("-----------------------------------------------");
        System.out.println("Bom dia, vamos fazer tuas compras bagual veio: ");
        System.out.println("-----------------------------------------------");

        System.out.println("Me diza teu nome: ");
        usuario.setNome(scan.nextLine());

        System.out.println("Agora me dis teu e meiol");
        usuario.setEmail(scan.nextLine());

        System.out.println("E tua senha (confia que não acontesse nada):");
        usuario.setSenha(scan.nextLine());

        System.out.println("Agora vamos pra outra etapa: oq tu quer comprar?");
        produto.setItem(scan.nextLine());

        System.out.println("E qual o presso?");
        boolean digitouCerto;
        do {
            try {
                produto.setValor(scan.nextDouble());
                scan.nextLine();
                digitouCerto = true;
            } catch (InputMismatchException e) {
                digitouCerto = false;
                System.err.println("Ói lá kkkkkk digito erado");
            } finally {
                scan.nextLine();
            }
        } while (digitouCerto == false);

        System.out.println("Me descreva tal item presente em vossa looj: ");
        produto.setDescrissao(scan.nextLine());

        System.out.println("Agora o enderesso: ");
        compra.setLocal(scan.nextLine());

        System.out.println("O pagamento $$$$$$$$$$$$$$$$$$$ vai ser como?");
        compra.setPagamento(scan.next());

        System.out.println("E o frete dá quanto?");
        compra.setFrete(scan.nextDouble());

        compra.imprimir();
    }
}
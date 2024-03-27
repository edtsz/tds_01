import java.util.Scanner;

public class looj {

    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);
        compra compra = new compra();
        usuario usuario = new usuario();
        produto produto = new produto();

        System.out.println("-----------------------------------------------");
        System.out.println("Bom dia, vamos fazer tuas compras bagual veio: ");
        System.out.println("-----------------------------------------------");

        System.out.println("Me diza teu nome: ");
        usuario.setNome(scan.nextLine());

        System.out.println("Agora me dis teu e meiol");
        usuario.setEmail(scan.next());

        System.out.println("E tua senha (confia que não acontesse nada):");
        usuario.setSenha(scan.next());

        System.out.println("Agora vamos pra outra etapa: oq tu quer comprar?");
        produto.setItem(scan.next());

        System.out.println("E qual o presso?");
        produto.setValor(scan.nextDouble());
        
        System.out.println("Me descreva tal item presente em vossa looj: ");
        produto.setDescrissao(scan.next());

        System.out.println("Ok, me diza a data.");
        compra.setData(scan.next());

        System.out.println("Agora o enderesso: ");
        compra.setLocal(scan.next());

        System.out.println("O pagamento $$$$$$$$$$$$$$$$$$$ vai ser como?");
        compra.setPagamento(scan.next());

        System.out.println("E o frete dá quanto?");
        compra.setFrete(scan.nextDouble());

        compra.imprimir();
    }
}
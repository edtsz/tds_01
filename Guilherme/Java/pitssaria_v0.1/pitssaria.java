import java.util.Scanner;

public class pitssaria {

    public static void main ( String [] args) {

        System.out.println("Bem vindo à pitssaria: ");

        Scanner scan = new Scanner (System.in);

        pedidos pedidos = new pedidos();
        ItemDoPedido item = new ItemDoPedido();

        System.out.println("Fala o tipo da pitssa que tu qer: ");
        item.setTipo(scan.nextLine());

        System.out.println("Me diza o çabor da pitssa: ");
        item.setSabor(scan.nextLine());

        System.out.println("Diza o valor: ");
        item.setValor(scan.nextDouble());

        System.out.println("Nome do cliente: ");
        pedidos.setCliente(scan.next());

        System.out.println("Taxa de entrega: ");
        pedidos.setTaxaEntrega(scan.nextDouble());

        pedidos.adicionarItemDoPedido(item);
        pedidos.imprimir();
        
    }
}
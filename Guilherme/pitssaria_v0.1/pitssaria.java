import java.util.Scanner;

public class pitssaria {

    public void main ( String [] args) {

        System.out.println("Bem vindo à pitssaria: ");

        Scanner scan = new Scanner (System.in);

        pedidos ped = new pedidos();
        ItemDoPedido item = new ItemDoPedido();

        System.out.println("Fala o tipo da pitssa que tu qer: ");
        item.setTipo(scan.nextLine());

        System.out.println("Me diza o çabor da pitssa: ");
        item.setSabor(scan.nextLine());

        System.out.println("Diza o valor: ");
        item.setValor(scan.nextDouble());

        ped.adicionarItemDoPedido(item);

        System.out.println("Nome do cliente: ");
        ped.setCliente(scan.nextLine());

        System.out.println("Taxa de entrega: ");
        ped.setTx_entrega(scan.nextDouble());
        
    }
}
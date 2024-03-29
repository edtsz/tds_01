import java.util.Scanner;

public class pitssaria {

    public static void main ( String [] args) {

        System.out.println("Bem vindo à pitssaria: ");

        Scanner scan = new Scanner (System.in);
        String continuar;
        pedidos pedidos = new pedidos();

        do {
            ItemDoPedido item = new ItemDoPedido();

            System.out.println("Fala o tipo da pitssa que tu qer: ");
            item.setTipo(scan.nextLine().trim());

            System.out.println("Me diza o çabor da pitssa: ");
            item.setSabor(scan.nextLine().trim());

            pedidos.adicionarItemDoPedido(item);

            System.out.println("Maiç aoguma coiza?");
            continuar = scan.nextLine().trim();

        } while (continuar.equalsIgnoreCase("sim"));

        System.out.println("Nome do cliente: ");
        pedidos.setCliente(scan.next().trim());

        System.out.println("Onde tu moras xoven?");
        pedidos.setLocalEntrega(scan.nextLine().trim());

        pedidos.imprimir();
        
    }
}
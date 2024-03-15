import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("* Bem vindo a pizzaria! *");
        System.out.println("*************************");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        Pedido  pedido = new Pedido();
        ItemDoPedido item = new ItemDoPedido();

        System.out.print("Informe o tipo de pizza: ");
        item.setTipo(scan.nextLine());

        System.out.print("Informe o sabor da pizza: ");
        item.setSabor(scan.nextLine());

        System.out.print("Informe o valor da pizza: ");
        item.setValor(scan.nextDouble());
        scan.nextLine();

        System.out.print("Nome do cliente: ");
        pedido.setCliente(scan.nextLine());

        System.out.print("Taxa de entrega: ");
        pedido.setTaxaEntrega(scan.nextDouble());
        scan.nextLine();

        pedido.adicionarItemDoPedido(item);
        pedido.imprimir();
    }
}

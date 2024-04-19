import java.util.InputMismatchException;
import java.util.Scanner;

public class Pitssaria {
    public static void main(String[] args) {
        System.out.println("_________________________");
        System.out.println("  Bem vindo a pizzaria!  ");
        System.out.println("_________________________");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        Faturamento faturamento = new Faturamento();

        while(true) {
            System.out.println("Escolha uma opção");
            System.out.println("1: Novo pedido");
            System.out.println("2: Imprimir histórico");
            System.out.println("3: Imprimir pedido");
            System.out.println("#: Sair");
            String opcao = scan.nextLine();

            if ( opcao.equals("2")) {
                faturamento.imprimirRelatorio();
                continue;
            }
            if ( opcao.equals("3")) {
                System.out.printf("Qual pedido: %s\n", "");
                while(true) {
                    try {
                        faturamento.imprimirPedido(Integer.parseInt(scan.nextLine()));
                        break;
                    } catch (InputMismatchException e) {
                    } catch (IndexOutOfBoundsException e) {
                    }
                }
                continue;
            }
            if ( opcao.equals("#")) {
                break;
            }

            Pedidos pedido = new Pedidos();
            String continuar;
            do {
                ItemDoPedido item = new ItemDoPedido();

                System.out.print("Informe o tipo de pitssa: ");
                item.setTipo(scan.nextLine().trim());

                System.out.print("Informe o çabor da pitssa: ");
                item.setSabor(scan.nextLine().trim());

                pedido.adicionarItemDoPedido(item);

                System.out.print("maiç alguma coiza? ");
                continuar = scan.nextLine().trim();
            } while (!continuar.equalsIgnoreCase(""));

            System.out.print("Nome do cliente: ");
            pedido.setCliente(scan.nextLine().trim());

            System.out.print("Locau de entrega: ");
            pedido.setLocalEntrega(scan.nextLine().trim());

            faturamento.addPedido(pedido);
        }

        scan.close();
    }
}
//
//switch(menuopc){
//    case "1": 
//        do {
//            ItemDoPedido item = new ItemDoPedido();
//
//            System.out.println("Fala o tipo da pitssa que tu qer: ");
//            System.out.println("Tradicional: R$40,00");
//            System.out.println("Especial: R$50,00");
//            System.out.println("Mista: R$60,00");
//            item.setTipo(scan.nextLine().trim());
//
//            System.out.println("Me diza o çabor da pitssa: ");
//            item.setSabor(scan.nextLine().trim());
//
//            pedidos.adicionarItemDoPedido(item);
//
//            System.out.println("Maiç aoguma coiza?");
//            continuar = scan.nextLine().trim();
//
//        } while (continuar.equalsIgnoreCase("sim"));
//
//        System.out.println("Nome do cliente: ");
//        pedidos.setCliente(scan.nextLine().trim());
//
//        System.out.println("Onde tu moras xoven?");
//        pedidos.setLocalEntrega(scan.nextLine().trim());
//
//        faturamento.addPedido(pedido);
//
//        pedidos.imprimir();
//        break;
//    
//    case "2":
//    System.out.println("Error 404! Estamos trabalhando nisso.");
//    break;
//    
//    case "3":
//    break;
//}
import java.util.Scanner;

public class pitssaria {

    public static void main ( String [] args) {

        System.out.println("Bem vindo à pitssaria: ");

        Scanner scan = new Scanner (System.in);
        String continuar;
        pedidos pedidos = new pedidos();
        faturamento faturamento = new faturamento();

        System.out.println("--------------------------------");
        System.out.println("Opções:");
        System.out.println("1.Pedidos");
        System.out.println("2.Imprimir Histórico");
        System.out.println("#.SAIR");
        System.out.println("--------------------------------");
        String menuopc = scan.nextLine();

        switch(menuopc){
            case "1": 
                do {
                    ItemDoPedido item = new ItemDoPedido();
        
                    System.out.println("Fala o tipo da pitssa que tu qer: ");
                    System.out.println("Tradicional: R$40,00");
                    System.out.println("Especial: R$50,00");
                    System.out.println("Mista: R$60,00");
                    item.setTipo(scan.nextLine().trim());
        
                    System.out.println("Me diza o çabor da pitssa: ");
                    item.setSabor(scan.nextLine().trim());
        
                    pedidos.adicionarItemDoPedido(item);
        
                    System.out.println("Maiç aoguma coiza?");
                    continuar = scan.nextLine().trim();
        
                } while (continuar.equalsIgnoreCase("sim"));
        
                System.out.println("Nome do cliente: ");
                pedidos.setCliente(scan.nextLine().trim());
        
                System.out.println("Onde tu moras xoven?");
                pedidos.setLocalEntrega(scan.nextLine().trim());

                faturamento.addPedido(pedido);
        
                pedidos.imprimir();
                break;
            
            case "2":
            System.out.println("Error 404! Estamos trabalhando nisso.");
            break;

            case "3":
            break;
        }

            
    }
}
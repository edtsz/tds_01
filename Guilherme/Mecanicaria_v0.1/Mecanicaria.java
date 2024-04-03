import java.util.Scanner;

public class Mecanicaria {

    public static void main (String [] args) {
        
        Cliente cliente = new Cliente();
        Servico servico = new Servico();
        Veiculo veiculo = new Veiculo();
        OrdemServico ordem = new OrdemServico();

        System.out.println("Aoba meu fi, bem vindo a mecanicaria do Tião");
        Scanner scan = new Scanner(System.in);

        System.out.println("Fala teu nome chapa: ");
        cliente.setNome(scan.nextLine().trim());

        System.out.println("Teu endereço: ");
        cliente.setEndereco(scan.nextLine().trim());

        System.out.println("CPF??????????????????");
        cliente.setCPF(scan.nextLine().trim());

        System.out.println("passa o telefone ai ");
        cliente.setContato(scan.nextLine().trim());

        System.out.println("Vamo pro qe enteressa, teu veiculo altamente exposivo com altas dozes de radiação sendo liberadas. Me descreva: ");
        veiculo.setDescVeiculo(scan.nextLine().trim());

        System.out.println("Que placa é?");
        veiculo.setPlaca(scan.nextLine().trim());

        System.out.println("Em que ano situa-se a fabricação de vosso calhambeque?");
        veiculo.setAno(scan.nextInt());
    }
}
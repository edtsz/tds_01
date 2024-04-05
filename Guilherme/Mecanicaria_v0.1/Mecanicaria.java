import java.util.Scanner;

public class Mecanicaria {

    public static void main (String [] args) {
        
        Cliente cliente = new Cliente();
        Servico servico = new Servico();
        Veiculo veiculo = new Veiculo();
        OrdemServico ordem = new OrdemServico();

        System.out.println("Aoba meu fi, bem vindo a mecanicaria do Tião");
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        cliente.setNome(scan.nextLine().trim());

        System.out.println("Digite seu endereço:");
        cliente.setEndereco(scan.nextLine().trim());

        System.out.println("Informe o CPF:");
        cliente.setCpf(scan.nextLine().trim());

        System.out.println("Diga-me o seu telefone:");
        cliente.setContato(scan.nextLine().trim());

        ordem.setCliente(cliente);

        System.out.println("Qual a marca do carro?");
        veiculo.setMarca(scan.nextLine());

        System.out.println("E qual o nome do veículo?");
        veiculo.setNomeVeiculo(scan.nextLine());

        System.out.println("Me descreva o problema:");
        veiculo.setDescricao(scan.nextLine().trim());

        System.out.println("Qual a placa?");
        veiculo.setPlaca(scan.nextLine().trim());

        System.out.println("Em que ano foi fabricado?");
        veiculo.setAno(scan.nextInt());

        ordem.setVeiculo(veiculo);

        System.out.println("Quais problemas o mecânico encontrou?");
        servico.setProblemasMec(scan.nextLine());

        System.out.println("Quanto tempo você espera que o carro esteja pronto?");
        servico.setTempoCLi(scan.nextDouble());

        System.out.println("Quanto tempo demorou para receber o veículo pronto?");
        servico.setTempoMec(scan.nextDouble());

        ordem.setServico(servico);

        ordem.imprimir();
    }

    
    
}
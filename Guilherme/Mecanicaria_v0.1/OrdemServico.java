import java.util.ArrayList;

public class OrdemServico {
    private double total = .0;
    private Cliente cliente;
    private Veiculo veiculo;
    private Servico servico;
    private ArrayList<Servico> servicos = new ArrayList<Servico>();
    
    public Cliente getCliente() {
        return this.cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void addTotal(Double total) {
        this.total += total;
    }
    public Veiculo getVeiculo() {
        return this.veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public Servico getServico(Integer index) {
        return this.servicos.get(index);
    }
    public void setServico(Servico servicos) {
        this.servicos.add(servicos);
    }

    public void imprimir() {
        System.out.println("_________________________________");
        System.out.println("             Cliente             ");
        System.out.println("_________________________________");
        System.out.println("Nome da vossa clientela: " + this.getCliente().getNome());
        System.out.println("CPF: " + this.getCliente().getCpf());
        System.out.println("Endereço: " + this.getCliente().getEndereco());
        System.out.println("Telefone: " + this.getCliente().getContato());
        System.out.println("_________________________________");
        System.out.println("              Veiculo            ");
        System.out.println("_________________________________");
        System.out.println("Marca: " + this.getVeiculo().getMarca());
        System.out.println("Nome: " + this.getVeiculo().getNomeVeiculo());
        System.out.println("Placa: " + this.getVeiculo().getPlaca());
        System.out.println("Ano: " + this.getVeiculo().getAno());
        System.out.println("_________________________________");
        System.out.println("            Problemas            ");
        System.out.println("_________________________________");
        for (int i = 0 ; i < this.servicos.size() ; i++) {
            System.out.print(this.servicos.get(i).getDescricao());
            System.out.print(": ");
            Integer padding = 73 - (this.servicos.get(i).getDescricao().length() + 3);
            System.out.printf("%"+padding+".2f\n", this.servicos.get(i).getValor());
        }
        System.out.println("_________________________________");
        System.out.println("             Serviços            ");
        System.out.println("Tempo previsto: " + this.getServico().getTempoCLi());
        System.out.println("Tempo em que foi entrege: " + this.getServico().getTempoMec());
        System.out.println("_________________________________");

    }
}
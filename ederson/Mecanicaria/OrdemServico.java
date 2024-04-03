import java.util.ArrayList;

public class OrdemServico {
    private Double total = .0;
    private Cliente cliente;
    private Veiculo veiculo;
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
}

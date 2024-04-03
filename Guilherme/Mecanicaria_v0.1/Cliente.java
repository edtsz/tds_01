public class Cliente {

    private string nome;
    private string endereco; 
    private string cpf;
    private string telefone;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public string getNome() {
        return nome;
    }

    public void setEndereco(String nome) {
        this.endereco = endereco;
    }
    public string getEndereco() {
        return endereco;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    public string getCPF() {
        return cpf;
    }

    public void setContato(String telefone) {
        this.telefone = telefone;
    }
    public string getContato() {
        return telefone;
    }
}
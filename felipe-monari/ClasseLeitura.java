class ClasseLeitura {
    private String nome, raca, cor;
    private Integer idade;

     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void imprimeObjeto() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Raca: "+this.raca);
        System.out.println("Cor: "+this.cor);
        System.out.println("Idade: "+this.idade);
    }
}

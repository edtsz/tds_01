abstract class Animal {
    protected String nome;
    protected String raca;
    protected String onomatopeia;
    protected String cor;
    protected Integer idade;

    public void fazBarulho() {
        System.out.println(this.onomatopeia);
    }

    public String toString() {
        return
            "Nome  : " + this.nome + "\n" +
            "Raça  : " + this.raca + "\n" +
            "Cor   : " + this.cor + "\n" +
            "Idade : " + this.idade + "\n" +
            "Som   : " + this.onomatopeia;
    }
}

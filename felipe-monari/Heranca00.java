public class Heranca00 {
    public static void main(String[]args){
        Cachorro c = new Cachorro("Benzetaciuuu");
        c.toString();
        c.fazBarulho();
    }
}
    abstract class Animal{
        String nome, onomatopeia, raca, cor;
        Integer idade;

    public void fazBarulho(){
}
    public String toString(){
        return System.out.println(
        "Nome: "+this.nome+ "\n";
        "Raca: "+this.raca + "\n";
        "Cor: "+this.cor + "\n";
        "Idade: "+this.idade + "\n";
        "Som: "+this.onomatopeia + "\n"
    );
    }
}
class Cachorro(){
    Cachorro(String nome){
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.onomatopeia = onomatopeia;
    }
}
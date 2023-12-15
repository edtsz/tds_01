
public class Heranca00 {

    public static void main(String[] args) {
        Cachorro deyverson = new Cachorro("Deyverson", "raça77", "cor88", "onomatopeia77", 66);
        System.out.println(deyverson);

        Cachorro johnTextor = new Cachorro("John Textor", "raça88", "cor99", "onomatopeia99", 77);
        System.out.println(johnTextor);

        Cachorro ribamar = new Cachorro("Ribamar", "raça77", "cor77", "onomatopeia88", 88);
        System.out.println(ribamar);

    }
}

abstract class Animal {

    String nome, onomatopeia, raca, cor;
    Integer idade;

    public String toString() {
        return "\nNome: " + this.nome + "\n"
                + "Raca: " + this.raca + "\n"
                + "Cor: " + this.cor + "\n"
                + "Idade: " + this.idade + "\n"
                + "Som: " + this.onomatopeia + "\n";
    }
}

class Cachorro extends Animal {

    Cachorro(String nome, String raca, String cor, String onomatopeia, Integer idade) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.onomatopeia = onomatopeia;
    }
}

public class Heranca00 {
    public static void main(String[] args) {
        Cachorro rufus = new Cachorro();
        rufus.fazBarulho();
        rufus.descrever();
        Cachorro astolfo = new Cachorro("astolfo", "au au", "Pastor-alemão", "marrom", 5);
        astolfo.fazBarulho();
        astolfo.descrever();
        Cachorro doggus = new Cachorro("doggus", "au au", "husky", "white", 3);
        doggus.fazBarulho();
        doggus.descrever();

    }

}

abstract class Animal {
    String nome;
    String onomatopeia; // representacao sonora emitida pelo animal
    String cor;
    Integer idade;
    String raca;

    public void fazBarulho() {
        System.out.println(this.onomatopeia);
    }

    public void descrever() {
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cor: " + this.cor);
        System.out.println("Nome: "+ this.nome);

    }

}

class Cachorro extends Animal {
    public Cachorro() { 
        this.nome = "Rufus";
        this.onomatopeia = "au au";
        this.raca = "Vira-lata";
        this.cor = "Caramelo";
        this.idade = 2;
    }

    public Cachorro(String nome, String onomatopeia, String raca, String cor, Integer idade) {
        this.nome = nome;
        this.onomatopeia = onomatopeia;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
    }
}
public class Heranca00 {
    public static void main(String[] args) {
        Cachorro rufus = new Cachorro();
        System.out.println(rufus);
        Cachorro astolfo = new Cachorro("astolfo", "au au", "Pastor-alemão", "marrom", 5);
        System.out.println(astolfo);
        Cachorro doggus = new Cachorro("doggus", "au au", "husky", "white", 3);
        System.out.println(doggus);
        Gato bortolomeu = new Gato("bartolomeu", "miau", "ragdoll", "white", 2);
        System.out.println(bortolomeu);
    }

}

abstract class Animal {
    String nome;
    String onomatopeia;
    String cor;
    Integer idade;
    String raca;


    public String toString(){
        return "Nome: " + this.nome + "\nRaça: " + this.raca  + "\nCor: " + this.cor  + "\nIdade: " + this.idade + "\nSom: " + this.onomatopeia + "\n";
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

class Gato extends Animal{
    public Gato(String nome, String onomatopeia, String raca, String cor, Integer idade) {
        this.nome = nome;
        this.onomatopeia = onomatopeia;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
    }
}
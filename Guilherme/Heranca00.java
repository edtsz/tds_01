public class Heranca00{
    public static void main(String[] args) {
        System.out.println("Aoba!");

        Cachorro a  = new Cachorro("Jairsaodamecanica");
        System.out.println(a);

        Gato b = new Gato("Nelsondospeneu");
        System.out.println(b);

        Cavalo c = new Cavalo("renataodaborracharia");
        System.out.println(c);
    }
}
abstract class Animal {
    String nome;
    String onomatopeia;
    String cor;
    String raca;
    Integer idade;
    
    public String toString () {
        return 
        "Raça:" + this.raca + "\n" +
        "Nome:" + this.nome + "\n" + 
        "Cor:" + this.cor + "\n" +
        "Idade:" + this.idade + "\n" +
        "Som:" + this.onomatopeia;
    }

}
class Cachorro extends Animal {
    Cachorro (String jairsaodamecanica) {
        this.nome = jairsaodamecanica;
        this.onomatopeia = "auauau";
        this.cor = "negao";
        this.raca = "vira-lata";
        this.idade = 12;
    }
}
class Gato extends Animal {
    Gato (String nelsondospeneu) {
        this.nome = nelsondospeneu;
        this.onomatopeia = "miau";
        this.cor = "branquelo";
        this.raca = "num sei";
        this.idade = 5;
    }
}
class Cavalo extends Animal {
    Cavalo (String renataodaborracharia) {
        this.nome = renataodaborracharia;
        this.onomatopeia = "***relinchos audazes***";
        this.cor = "preto";
        this.raca = "não sabo";
        this.idade = 10;
    }
}

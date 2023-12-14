public class Heranca00{
    public static void main(String[] args) {
        System.out.println("Aoba!");

        Cachorro adao = new Cachorro();
        adao.faisbaruio();
        adao.descrever();

        Gato jair = new Gato();
        jair.faisbaruio();
        jair.faisbaruio();

        Cavalo renataodaborracharia = new Cavalo();
        renataodaborracharia.faisbaruio();
        renataodaborracharia.faisbaruio();
    }
}

abstract class Animal {
    String nome;
    String onomatopeia;
    String cor;
    String raca;
    Integer idade;

    public void faisbaruio() {
        System.out.println(this.onomatopeia);
    }
    public void descrever() {
        System.out.println("Raça:" + this.raca);
        System.out.println("Nome:" + this.nome);
        System.out.println("Cor:" + this.cor);
        System.out.println("Idade:" + this.idade);
    }

}

class Cachorro extends Animal {
    Cachorro () {
        this.nome = "adao";
        this.onomatopeia = "auauau";
        this.cor = "negao";
        this.raca = "vira-lata";
        this.idade = 12;
    }
}
class Gato extends Animal {
    Gato () {
        this.nome = "jair";
        this.onomatopeia = "miau";
        this.cor = "branquelo";
        this.raca = "num sei";
        this.idade = 5;
    }
}
class Cavalo extends Animal {
    Cavalo () {
        this.nome = "renataodaborracharia";
        this.onomatopeia = "***relinchos audazes***";
        this.cor = "preto";
        this.raca = "não sabo";
        this.idade = 10;
    }
}
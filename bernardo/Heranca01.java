public class Heranca01 {
    public static void main(String[] args) {
        System.out.println("funfeia!");
        Cachorro fred = new Cachorro();
        fred.fazBarulho();
        fred.descrever();

        Pinscher Pitoco = new Pinscher();
        Pitoco.fazBarulho();
        Pitoco.descrever();
        
        ShihTzu Paçoca = new ShihTzu();
        Paçoca.fazBarulho();
        Paçoca.descrever();
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
    Cachorro() { // metodo construtor, o que define o cão !
        this.nome = "fred";
        this.onomatopeia = "au au";
        this.raca = "vira-lata";
        this.cor = "Caramelo";
        this.idade = 2;
    }
}
class Pinscher extends Cachorro {
    Pinscher() {
        this.nome = "Pitoco";
        this.onomatopeia = "auuuuuu";
        this.raca = "Pinscher";
        this.cor = "Preto";
        this.idade = 10;
    }
}
class ShihTzu extends Cachorro {
    ShihTzu() {
        this.nome = "Paçoca";
        this.onomatopeia = "auuuuuuau";
        this.raca = "Shih-tzu";
        this.cor = "Dourado";
        this.idade = 7;
    }
}

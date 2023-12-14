public class Heranca00 {
    public static void main(String[] args) {
        System.out.println("funfeia!");
        Cachorro fred = new Cachorro();
        fred.fazBarulho();
        fred.descrever();

        Gato minerin = new Gato();
        minerin.fazBarulho();
        minerin.descrever();

        Javali jorge = new Javali();
        jorge.fazBarulho();
        jorge.descrever();

        Shitzu luizin = new Shitzu();
        luizin.fazBarulho();
        luizin.descrever();

        Pastoralemao vargas = new Pastoralemao();
        vargas.fazBarulho();
        vargas.descrever();

        Pinscher diabinho = new Pinscher();
        diabinho.fazBarulho();
        diabinho.descrever();

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

class Cachorro {
    Cachorro(String nome) {
        this.nome = nome;
    }
}

class Gato extends Animal {
    public Gato() { //metodo construtor, que define o gato !
        this.nome = "Juno";
        this.onomatopeia = "miar";
        this.raca = "de-rua";
        this.cor = "Malhado";
        this.idade = 3;
    }
}

class Javali extends Animal {
    public Javali() {
        this.nome = "jumbo";
        this.onomatopeia = "reeeeeee";
        this.raca = "PRAGA";
        this.cor = "Preto";
        this.idade = 12;

    }
}

class Shitzu extends Animal {
    public Shitzu() {
        this.nome = "luizin";
        this.onomatopeia = "woof woof";
        this.raca = "Shitzu";
        this.cor = "caramelin";
        this.idade = 4;
    }
}

class Pastoralemao extends Animal {
    public Pastoralemao() {
        this.nome = "vargas";
        this.onomatopeia = "aoof, aoof";
        this.raca = "Pastor alemão";
        this.cor = "marrom e preto";
        this.idade = 8;
    }
}

class Pinscher extends Animal {
    public Pinscher() {
        this.nome = "diabinho";
        this.onomatopeia = "gritos de raiva";
        this.raca = "Pinscher";
        this.cor = "preto e marrom";
        this.idade = 6;
    }
}

public class Heranca00 {
    public static void main(String[] args) {
        System.out.println("funfeia!");

        Cachorro fred = new Cachorro();
        fred.fazBarulho();
        fred.descrever();

        Gato minerin = new Gato();
        minerin.fazBarulho();
        minerin.descrever();

        CachorroP pumba = new CachorroP();
        pumba.fazBarulho();
        pumba.descrever();

        CachorroV viralata = new CachorroV();
        viralata.fazBarulho();
        viralata.descrever();


    }

}

abstract class Animal {
    String nome;
    String onomatopeia; //representacion en sonido emitido por un animal!
    String cor;
    Integer idade;
    String raca;

    public void fazBarulho() {
        System.out.println(this.onomatopeia);
    }

    public void descrever() {
        System.out.println("Raça: " + this.raca);
        System.out.println("Onomatopeia: " + this.onomatopeia);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cor: " + this.cor);
        System.out.println("Nome: "+ this.nome);

    }

}

class Cachorro extends Animal {
    Cachorro() { //metodo constructor, para describir la clase cachorro!
        this.nome = "fred";
        this.onomatopeia = "au au";
        this.raca = "vira-lata";
        this.cor = "Caramelo";
        this.idade = 2;
    }
}

class Gato extends Animal {
    public Gato() { 
        this.nome = "gatito";
        this.onomatopeia = "miar";
        this.raca = "de-rua";
        this.cor = "Malhado";
        this.idade = 3;

    }
}

class CachorroP extends Animal {
    public CachorroP() {
        this.nome = "Pumba";
        this.onomatopeia = "UAUAU";
        this.raca = "Pitbull";
        this.cor = "Preto";
        this.idade = 12;

    }
}

class CachorroV extends Animal {
    public CachorroV() {
        this.nome = "Bobi";
        this.onomatopeia = "Uau";
        this.raca = "viralata";
        this.cor = "marron";
        this.idade = 10;

    }
}

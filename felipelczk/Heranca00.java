public class Heranca00 {
    public static void main(String[] args) {
        Cachorro Juquinha = new Cachorro("Juquinha", "Pastor alemão", "amarelo", 4, "au au");
        System.out.println(Juquinha);
        Cachorro Joninhas = new Cachorro("Joninhas", "Pinscher", "preto e marrom", 3, "grr grr");
        System.out.println(Joninhas);
        Cachorro Lupita = new Cachorro("Lupita", "Chow chow", "laranja", 5 ,"woof woof");
        System.out.println(Lupita);
        Gato Leia = new Gato("Léia", "Siames", "branco", 6, "miau miau");
        System.out.println(Leia);
    }

}

abstract class Animal {
    String nome;
    String onomatopeia; // representacao sonora emitida pelo animal
    String cor;
    Integer idade;
    String raca;


    public String toString() {
        return "Nome: " + this.nome + "\n"+
         "Raça: " + this.raca + "\n"+
         "Cor: " + this.cor + "\n"+
         "Idade: " + this.idade + "\n"+
         "Som: " + this.onomatopeia;

    }

}

class Cachorro extends Animal {
    Cachorro(String nome, String raca, String cor, Integer idade, String onomatopeia) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.onomatopeia = onomatopeia;
    }
}

class Gato extends Animal {
    Gato(String nome, String raca, String cor, Integer idade, String onomatopeia) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.onomatopeia = onomatopeia;
    }
}

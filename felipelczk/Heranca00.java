public class Heranca00 {
    public static void main(String[] args) {
        Cachorro Juquinha = new Cachorro("Juquinha");
        System.out.println(Juquinha);
        Cachorro Joninhas = new Cachorro("Joninhas");
        System.out.println(Joninhas);
        Cachorro Lupita = new Cachorro("Lupita");
        System.out.println(Lupita);
        
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
    Cachorro(String nome) {
        this.nome = nome;
    }
}

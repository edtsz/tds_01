public class Heranca01 {
    public static void main(String[] args) {
        
        Cachorro fred = new Cachorro("fred", "Vira-lata", "preto", "auau", 5);
        System.out.println(fred);

        Cachorro thor = new Cachorro("Thor","Pinscher", "Marrom", "auauauauau", 15);
        System.out.println(thor);

        Cachorro romeu = new Cachorro("Romeu","Salsicha","Caramelo","auau", 9);
        System.out.println(romeu);

        Gato pelucio = new Gato("Pelucio","Persa","Caramelo","miaaauuuu", 3);
        System.out.println(pelucio);
    
        Cavalo datsun = new Cavalo("Datsun","Puro-Sangue-Árabe","Dourado","bruuuuu", 10);
        System.out.println(datsun);
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

    public String toString() { // representa a classe atual em forma de string
        return  "Nome: " + this.nome + "\n"+
                "Raça: " + this.raca + "\n"+
                "Cor: " + this.cor + "\n"+
                "Idade: " + this.idade + "\n"+
                "Som: " + this.onomatopeia+"\n";
    }
}

class Cachorro extends Animal{ 
    
    Cachorro(String nome, String raca, String cor, String onomatopeia, Integer idade){
        this.nome = nome;    
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.onomatopeia = onomatopeia;
    }
}

class Gato extends Animal{
    Gato(String nome, String raca, String cor, String onomatopeia, Integer idade){
        this.nome = nome;    
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.onomatopeia = onomatopeia;
    }
}

class Cavalo extends Animal{ 
    Cavalo(String nome, String raca, String cor, String onomatopeia, Integer idade){
        this.nome = nome;    
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.onomatopeia = onomatopeia;
    }
}
public class Heranca00 {
    public static void main(String[] args) {
        Cachorro cao1 = new Cachorro ("chapolin", "pit bull", "auauaua", "preta", 3);
        System.out.println (cao1);
        cao1.fazBarulho();
        Cachorro cao2 = new Cachorro ("negão", "pincher", "arararar", "preta", 2);
        System.out.println (cao2);
        cao2.fazBarulho();
        Cachorro cao3 = new Cachorro ("chopper", "doberman", "ululul", "marrom", 5);
        System.out.println (cao3);
        cao3.fazBarulho();

        Gato gato1 = new Gato ("mimi", "Perça", "miau", "branco", 3);
        System.out.println (gato1);
        gato1.fazBarulho();
        Gato gato2 = new Gato ("tom", "siames", "mial", "preta", 2);
        System.out.println (gato2);
        gato2.fazBarulho();
        Gato gato3 = new Gato ("eneas", "angora", "meow", "marrom", 5);
        System.out.println (gato3);
        gato3.fazBarulho();

        Cavalo cavalo1 = new Cavalo ("napoleao", "puro sangue arabe", "iiiihon", "vermelho", 8);
        System.out.println (cavalo1);
        cavalo1.fazBarulho();
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
     public String toString (){
    return  "Nome: "+ this.nome + "\n" +
            "Raça: "+ this.raca + "\n" +
            "Cor: "+ this.cor + "\n" +
            "Idade: "+ this.idade + "\n" +
            "Som: "+ this.onomatopeia + "\n";
   }
}
class Cachorro extends Animal {
    Cachorro (String nome,  String raca, String onomatopeia, String cor, Integer idade ){
        this.nome = nome;
        this.raca = raca;
        this.onomatopeia = onomatopeia;
        this.cor = cor;
        this.idade = idade;
    }
}
class Gato extends Animal {
    Gato (String nome,  String raca, String onomatopeia, String cor, Integer idade ){
        this.nome = nome;
        this.raca = raca;
        this.onomatopeia = onomatopeia;
        this.cor = cor;
        this.idade = idade;
    }
} 
class Cavalo extends Animal {
    Cavalo (String nome, String raca, String onomatopeia, String cor, Integer idade){
        this.nome = nome;
        this.raca = raca;
        this.onomatopeia = onomatopeia;
        this.cor = cor;
        this.idade = idade;
    }
}
  
 
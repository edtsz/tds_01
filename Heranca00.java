public class Heranca00 {
    public static void main(String[] args) {
        System.out.println("Inicio!");

        Cachorro cao1 = new Cachorro("Clovis");
        System.out.println(cao1);
        cao1.fazBarulho();


        Cachorro cao2 = new Cachorro("Mandioca");
        System.out.println(cao2);
        cao2.fazBarulho();

        Cachorro cao3= new Cachorro("Lupita");
        System.out.println(cao3);
        cao3.fazBarulho();
       // fred.descrever();

        /*
         * Gato minerin = new Gato();
         * minerin.fazBarulho();
         * minerin.descrever();
         * 
         * CachorroP pumba = new CachorroP();
         * pumba.fazBarulho();
         * pumba.descrever();
         * 
         * CachorroV viralata = new CachorroV();
         * viralata.fazBarulho();
         * viralata.descrever();
         */

    }

}

abstract class Animal {
    String nome;
    String onomatopeia; 
    Integer idade;
    String raca;
    String cor;

    public void fazBarulho() {
        System.out.println(this.onomatopeia);
    }

    /*
     * public void descrever() {
     * System.out.println("Raça: " + this.raca);
     * System.out.println("Onomatopeia: " + this.onomatopeia);
     * System.out.println("Idade: " + this.idade);
     * System.out.println("Cor: " + this.cor);
     * System.out.println("Nome: "+ this.nome);
     * 
     * }
     * 
     * }
     */

    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Raça: " + this.raca + "\n" +
                "Cor: " + this.cor + "\n" +
                "Idade: " + this.idade + "\n" +
                "Som: " + this.onomatopeia + "\n";

    }
}
class Cachorro extends Animal {
    Cachorro(String nome) {
        this.nome = nome;
        this.onomatopeia = "UAUAUA";
        this.raca = "Pastor Aleman";
        this.cor = "Preto-Marron";
        this.idade = 3;
    }
}

/*
 * class Gato extends Animal {
 * public Gato() {
 * this.nome = "gatito";
 * this.onomatopeia = "miar";
 * this.raca = "de-rua";
 * this.cor = "Malhado";
 * this.idade = 3;
 * 
 * }
 * }
 * 
 * class CachorroP extends Animal {
 * public CachorroP() {
 * this.nome = "Pumba";
 * this.onomatopeia = "UAUAU";
 * this.raca = "Pitbull";
 * this.cor = "Preto";
 * this.idade = 12;
 * 
 * }
 * }
 * 
 * class CachorroV extends Animal {
 * public CachorroV() {
 * this.nome = "Bobi";
 * this.onomatopeia = "Uau";
 * this.raca = "viralata";
 * this.cor = "marron";
 * this.idade = 10;
 * 
 * }
 * }
 */
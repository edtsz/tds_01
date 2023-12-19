public class Heranca00 {
    public static void main(String[] args) {
        System.out.println("Inicio!");

        Cachorro cao1 = new Cachorro("Clovis", "Pastor", "Cinza", "26", "UAUAU");
        System.out.println(cao1);
        //cao1.fazBarulho();


        Cachorro cao2 = new Cachorro("Mandioca", "Pincher", "Preto", "6", "UAUAU");
        System.out.println(cao2);
        //cao2.fazBarulho();

        Cachorro cao3= new Cachorro("Lupita", "Pittbul", "Marron", "2", "UAUAU");
        System.out.println(cao3);
        //cao3.fazBarulho();

       // fred.descrever();

    
         Gato persa = new Gato("Ladron", "Persa", "Branco", "5", "MIAU");
         System.out.println(persa);
         
         Caballo mustang = new Caballo("Cuatro", "Mustang", "BrancoePreto", "5", "SONIDODECABALLO");
         System.out.println(mustang);

        /* * CachorroP pumba = new CachorroP();
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
    String idade;
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
    Cachorro(String nome, String raca, String cor, String idade, String onomatopeia) {
        this.nome = nome;
        this.onomatopeia = onomatopeia;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
    }
}
    class Gato extends Animal {
        Gato(String nome, String raca, String cor, String idade, String onomatopeia) {
            this.nome = nome;
            this.onomatopeia = onomatopeia;
            this.raca = raca;
            this.cor = cor;
            this.idade = idade;
        }
}

    class Caballo extends Animal {
            Caballo(String nome, String raca, String cor, String idade, String onomatopeia){
                this.nome = nome;
                this.onomatopeia = onomatopeia;
                this.raca = raca;
                this.cor = cor;
                this.idade = idade;
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
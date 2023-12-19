public class Aula02 {
    public static void main(String[] args) {
        Animal jorge = new Animal("au au au au");
        jorge.atraphalharSono();
        Animal altair = new Animal("miaaaaaaaaaaau");
        altair.atraphalharSono();
        Animal galinha = new Animal("cocoricó!");
        galinha.atraphalharSono();
        Animal cavaloBaio = new Animal("ihihihihihihi,prrfffffff");
        cavaloBaio.atraphalharSono();
        Animal vaquinha = new Animal("mmmMUUH");
        vaquinha.atraphalharSono();
        Animal bruno = new Animal("Ola!");
        bruno.atraphalharSono();

    }
}

class Animal {
    String barulho;

    public void fazBarulho() {
        System.out.println(this.barulho);
    }

    public void atraphalharSono() {
        for (int i = 0; i < 10; i++) {
            this.fazBarulho();
        }
    }

    public Animal(String som) { //metodo construtor.
        this.barulho = som;
    }
}

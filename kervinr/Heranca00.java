public class Heranca00 {
    public static void main(String[] args) {
        System.out.println("Inicio!");

        Cachorro cao1 = new Cachorro("Clovis", "Pastor", "Cinza", "26", "UAUAU");
        System.out.println(cao1);

        Cachorro cao2 = new Cachorro("Mandioca", "Pincher", "Preto", "6", "UAUAU");
        System.out.println(cao2);

        Cachorro cao3= new Cachorro("Lupita", "Pittbul", "Marron", "2", "UAUAU");
        System.out.println(cao3);

         Gato persa = new Gato("Ladron", "Persa", "Branco", "5", "MIAU");
         System.out.println(persa);
         
         Caballo mustang = new Caballo("Toreto", "Mustang", "BrancoePreto", "5", "SONIDODECABALLO");
         System.out.println(mustang);

    }

}
import java.util.Scanner;
public class Leitura00 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite a raca: ");
        String raca = scan.nextLine();
        System.out.println("Digite a cor: ");
        String cor = scan.nextLine();
        System.out.println("Digite a idade: ");
        int idade = scan.nextInt();

        ClasseLeitura c = new ClasseLeitura();
        c.setNome(nome);
        c.setRaca(raca);
        c.setCor(cor);
        c.setIdade(idade);
        c.imprimeObjeto();
    }
}

import java.util.Scanner;
public class Leitura00 {
  public static void main(String[] args) {
    Scanner c = new Scanner(System.in); 
    System.out.println ("Digite o nome do cão: "); 
    String nome = c.nextLine();  
    System.out.println ("Digite a raça do cão: ");
    String raca = c.nextLine();
    System.out.println ("Digite a cor do cão: ");
    String cor = c.nextLine();
    System.out.println ("Digite a idade do cão: ");
    int idade = c.nextInt();
    
    System.out.println ("Nome do cão " + nome);  
    System.out.println ("Raça do cão: " + raca);
    System.out.println ("Cor do cão: " + cor);
    System.out.println ("Idade do cão: " + idade);
  } 
}
